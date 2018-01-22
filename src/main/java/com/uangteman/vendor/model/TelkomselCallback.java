package com.uangteman.vendor.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * TelkomselCallback
 */

@Entity
@Table(name = "telkomsel_callback")
public class TelkomselCallback implements Serializable {

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "customer_application_id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String customerApplicationId;

    @Column(name = "trx_id", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String trxId;

    @Column(name = "msisdn", nullable = true, length = 20, columnDefinition = "varchar(20) default NULL")
    private String msisdn;

    @Column(name = "sms", nullable = true, length = 160, columnDefinition = "varchar(160) default NULL")
    private String sms;

    @Column(name = "adn", nullable = true, length = 5, columnDefinition = "int(5) default NULL")
    private Integer adn;

    @Column(name = "result", nullable = true, columnDefinition = "double default NULL")
    private Double result;

    @Column(name = "error_code", length = 2, columnDefinition = "varchar(2) default NULL")
    private String errorCode;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp // auto set by hibernate when created
    private Date createdAt;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @Column(name = "updated_by")
    private Integer updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerApplicationId() {
        return customerApplicationId;
    }

    public void setCustomerApplicationId(String customerApplicationId) {
        this.customerApplicationId = customerApplicationId;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public Integer getAdn() {
        return adn;
    }

    public void setAdn(Integer adn) {
        this.adn = adn;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
}