package com.vcredit.restructure.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by dell on 2017/4/6.
 */
@Entity
@Table(name="wx_mobile")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Mobile {

    @Id
    private Integer mobileId;

    @NotNull
    private Integer orderId;

    @NotNull
    private String applyId;

    @NotNull
    private String status;

    @NotNull
    private Date createDate;

    @NotNull
    private Date updateDate;

    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
