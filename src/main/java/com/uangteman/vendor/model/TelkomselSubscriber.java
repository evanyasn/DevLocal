package com.uangteman.vendor.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * TelkomselSubscriber
 */

@Entity
@Table(name = "telkomsel_subscriber")
public class TelkomselSubscriber implements Serializable {

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "customer_application_id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String customerApplicationId;

    @Column(name = "msisdn", nullable = true, length = 15, columnDefinition = "varchar(15) default NULL")
    private String msisdn;

    @Column(name = "sms", nullable = true, length = 160, columnDefinition = "varchar(160) default NULL")
    private String sms;

    @Column(name = "keyword", nullable = true, length = 100, columnDefinition = "varchar(100) default NULL")
    private String keyword;

    @Column(name = "homeloc", nullable = true, length = 150, columnDefinition = "varchar(150) default NULL")
    private String homeloc;

    @Column(name = "workloc", nullable = true, length = 150, columnDefinition = "varchar(150) default NULL")
    private String workloc;

    @Column(name = "response", nullable = true, length = 100, columnDefinition = "varchar(100) default NULL")
    private String response;

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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getHomeloc() {
        return homeloc;
    }

    public void setHomeloc(String homeloc) {
        this.homeloc = homeloc;
    }

    public String getWorkloc() {
        return workloc;
    }

    public void setWorkloc(String workloc) {
        this.workloc = workloc;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
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