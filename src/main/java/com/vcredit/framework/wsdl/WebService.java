package com.vcredit.framework.wsdl;

import mypackage.PostLoanMobileWebService;
import mypackage.PostLoanMobileWebServiceSoap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by dell on 2017/4/7.
 */
@Component
public class WebService {

    @Value("${wsdl.postLoanMobileWebServiceUrl}")
    private String postLoanMobileWebServiceUrl;

    private static PostLoanMobileWebServiceSoap postLoanMobileWebServiceSoap = null;

    public PostLoanMobileWebServiceSoap getPostLoanMobileWebService() throws Exception{
        if (postLoanMobileWebServiceSoap==null){
            PostLoanMobileWebService postLoanMobileWebService= null;
            try {
                postLoanMobileWebService = new PostLoanMobileWebService(new URL(postLoanMobileWebServiceUrl));
            } catch (MalformedURLException e) {
               throw  new RuntimeException("WSDL URL转换出错");
            }
            WebService.postLoanMobileWebServiceSoap=postLoanMobileWebService.getPostLoanMobileWebServiceSoap();
        }
        return postLoanMobileWebServiceSoap;
    }
}
