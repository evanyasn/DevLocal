package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsSmsEmailDisbursement
 */
@Entity
@Table(name = "logs_sms_email_disbursement")
public class LogsSmsEmailDisbursement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Basic(optional = false)
    @Column(name = "loan_id", nullable = false, length = 45, columnDefinition = "varchar(45)")
    private String loanId;

    @Basic(optional = false)
    @Column(name = "process_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date processDatetime;

    @Column(name = "is_email_sent", nullable = false, columnDefinition = "ENUM('Y','N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isEmailSent = StateType.N;

    @Column(name = "is_sms_sent", nullable = false, columnDefinition = "ENUM('Y','N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isSmsSent = StateType.N;

    @Column(name = "is_email_retry", nullable = false, columnDefinition = "ENUM('Y','N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isEmailRetry = StateType.N;

    @Column(name = "is_sms_retry", nullable = false, columnDefinition = "ENUM('Y','N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isSmsRetry = StateType.N;

    @Basic(optional = false)
    @Column(name = "retry_email_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date retryEmailDatetime;

    @Basic(optional = false)
    @Column(name = "retry_sms_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date retrySmsDatetime;

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

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Date getProcessDatetime() {
        return processDatetime;
    }

    public void setProcessDatetime(Date processDatetime) {
        this.processDatetime = processDatetime;
    }

    public StateType getIsEmailSent() {
        return isEmailSent;
    }

    public void setIsEmailSent(StateType isEmailSent) {
        this.isEmailSent = isEmailSent;
    }

    public StateType getIsSmsSent() {
        return isSmsSent;
    }

    public void setIsSmsSent(StateType isSmsSent) {
        this.isSmsSent = isSmsSent;
    }

    public StateType getIsEmailRetry() {
        return isEmailRetry;
    }

    public void setIsEmailRetry(StateType isEmailRetry) {
        this.isEmailRetry = isEmailRetry;
    }

    public StateType getIsSmsRetry() {
        return isSmsRetry;
    }

    public void setIsSmsRetry(StateType isSmsRetry) {
        this.isSmsRetry = isSmsRetry;
    }

    public Date getRetryEmailDatetime() {
        return retryEmailDatetime;
    }

    public void setRetryEmailDatetime(Date retryEmailDatetime) {
        this.retryEmailDatetime = retryEmailDatetime;
    }

    public Date getRetrySmsDatetime() {
        return retrySmsDatetime;
    }

    public void setRetrySmsDatetime(Date retrySmsDatetime) {
        this.retrySmsDatetime = retrySmsDatetime;
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