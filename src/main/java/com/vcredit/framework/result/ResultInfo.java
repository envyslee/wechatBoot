package com.vcredit.framework.result;


/**
 * Created by dell on 2017/4/6.
 */
public class ResultInfo {
    private String status;
    private String message;
    private Object data;


    public ResultInfo(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResultInfo(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static ResultInfo build(String status,String message){
       return new ResultInfo(status,message);
    }

    public static  ResultInfo build(String status,String message,Object data){
        return  new ResultInfo(status,message,data);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
