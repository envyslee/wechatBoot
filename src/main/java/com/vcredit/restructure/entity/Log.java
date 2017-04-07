package com.vcredit.restructure.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dell on 2017/4/6.
 */
@Entity
@Table(name="wx_log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String operator;

    private Date logTime;

    private String className;

    private String logLevel;

    private String logResult;

    private String logParam;

    private String logMethod;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogResult() {
        return logResult;
    }

    public void setLogResult(String logResult) {
        this.logResult = logResult;
    }

    public String getLogParam() {
        return logParam;
    }

    public void setLogParam(String logParam) {
        this.logParam = logParam;
    }

    public String getLogMethod() {
        return logMethod;
    }

    public void setLogMethod(String logMethod) {
        this.logMethod = logMethod;
    }
}
