package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsGeneralEmail
 */
@Entity
@Table(name = "logs_general_email")
public class LogsGeneralEmail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Column(name = "customer_application_id", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String customer_application_id;

    @Column(name = "loan_id", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String loanId;

    @Column(name = "topic", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String topic;

    @Column(name = "trx_id", nullable = true, length = 10, columnDefinition = "bigint(10) default NULL")
    private String trxId;

    @Column(name = "sender", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String sender;

    @Column(name = "receiver", nullable = true, length = 50, columnDefinition = "varchar(50) default NULL")
    private String receiver;

    @Column(name = "template_id", nullable = true, length = 11, columnDefinition = "int(11) default NULL")
    private String templateId;

    @Lob
    @Column(name = "body", nullable = true, columnDefinition = "text")
    private String body;

    @Column(name = "sent_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date sentDatetime;

    @Basic(optional = false)
    @Column(name = "state", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType state = StateType.N;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer_application_id() {
        return customer_application_id;
    }

    public void setCustomer_application_id(String customer_application_id) {
        this.customer_application_id = customer_application_id;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getSentDatetime() {
        return sentDatetime;
    }

    public void setSentDatetime(Date sentDatetime) {
        this.sentDatetime = sentDatetime;
    }

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
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