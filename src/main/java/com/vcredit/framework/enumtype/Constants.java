package com.vcredit.framework.enumtype;

/**
 * Created by dell on 2017/4/7.
 */
public class Constants {

    private   final static String SUCCESS_CODE="000";
    private  final static String SUCCESS_MSG="请求成功";
    private final static String FAIL_CODE="999";
    private final static String FAIL_MSG="未定义的错误";

    public enum  ResultEnum{
        SUCCESS(SUCCESS_CODE,SUCCESS_MSG),FAIL(FAIL_CODE,FAIL_MSG);
        private String code;
        private String msg;

        ResultEnum(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }

}
