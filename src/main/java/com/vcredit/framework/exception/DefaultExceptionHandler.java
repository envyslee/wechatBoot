package com.vcredit.framework.exception;

import com.vcredit.framework.enumtype.Constants;
import com.vcredit.framework.result.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by dell on 2017/4/6.
 */
@ControllerAdvice
public class DefaultExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public ResultInfo handler(Exception ex){
       return  ResultInfo.build(Constants.ResultEnum.FAIL.getCode(),ex.getMessage());
    }
}
