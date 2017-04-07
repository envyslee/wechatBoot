package com.vcredit.restructure.controller;

import com.vcredit.framework.enumtype.Constants;
import com.vcredit.framework.result.ResultInfo;
import com.vcredit.framework.wsdl.WebService;
import com.vcredit.restructure.entity.Mobile;
import com.vcredit.restructure.service.MobileService;
import mypackage.ArrayOfLoanOrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/4/6.
 */

@Controller
@RequestMapping("/main")
public class MainController {

    private static Logger log= LoggerFactory.getLogger(MainController.class);

    @Autowired
    MobileService mobileService;

    @Autowired
    WebService webService;

    @ResponseBody
    @RequestMapping("/getStr")
    public String getStr() throws  Exception{
        log.debug("debug");
        log.info("info");
        return "hello world";
    }

    @ResponseBody
    @RequestMapping("/getData")
    public Map getData(){
        Map<String,String> map=new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        return map;
    }

    @ResponseBody
    @RequestMapping("/getMobile")
    public ResultInfo getMobile(Integer id)throws Exception{
        Mobile mobile=  mobileService.getMobile(id);
        return ResultInfo.build(Constants.ResultEnum.SUCCESS.getCode(),Constants.ResultEnum.SUCCESS.getMsg(),mobile);
    }

    @ResponseBody
    @RequestMapping("/getWsdl")
    public ResultInfo getWsdl()throws Exception{
        ArrayOfLoanOrderInfo orderInfo= webService.getPostLoanMobileWebService().excute("320981199102044251",null,null);
        return ResultInfo.build(Constants.ResultEnum.SUCCESS.getCode(),Constants.ResultEnum.SUCCESS.getMsg(),orderInfo);
    }
}
