package com.vcredit.framework.aop;

import java.lang.reflect.Method;

import com.vcredit.framework.utils.JacksonUtil;
import com.vcredit.restructure.entity.Log;
import com.vcredit.restructure.repository.LogRepository;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Created by dell on 2017/4/6.
 */
@Aspect
@Component
public class ControllerInterceptor {

    private static  final Logger log= LoggerFactory.getLogger(ControllerInterceptor.class);

    @Resource
    LogRepository logRepository;

    @Pointcut("@annotation(com.vcredit.framework.annotation.Log)")
    public void logPointcut(){}

    @Around("logPointcut()")
    public Object log(ProceedingJoinPoint pjp) throws Exception{
        long beginTime=new Date().getTime();
        MethodSignature signature= (MethodSignature) pjp.getSignature();
        Method method=signature.getMethod();
        String methodName=method.getName();
        String className= method.getDeclaringClass().getName();
        Object[] args=pjp.getArgs();

        log.info("方法：{}，参数：{}",methodName,args);

        Object result= null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            String exception=throwable.getClass()+":"+throwable.getMessage();
            long endTime=new Date().getTime();
            long costTime=endTime-beginTime;
            persistLog(costTime,className,"ERROR",exception,JacksonUtil.Obj2Json(args),methodName);
            throw new RuntimeException(throwable.getMessage());
        }

        long endTime=new Date().getTime();
        long costTime=endTime-beginTime;
        persistLog(costTime,className,"INFO", JacksonUtil.Obj2Json(result),JacksonUtil.Obj2Json(args),methodName);
        return  result;
    }


    private void persistLog(long operater,String className,String logLevel,String logResult,String logParam,String logMethod){
        Log l=new Log();
        l.setOperator(String.valueOf(operater));
        l.setClassName(className);
        l.setLogLevel(logLevel);
        l.setLogResult(logResult);
        l.setLogParam(logParam);
        l.setLogMethod(logMethod);
        l.setLogTime(new Date());
        logRepository.save(l);
    }
}
