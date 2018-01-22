package com.uangteman.vendor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.uangteman.common.model.constant.StateType;

@Entity
@Table(name = "logs_aff_sms_email_disbursement")
public class LogsAffSmsEmailDisbursement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Integer id;

	@Basic(optional = false)
	@Column(name = "aff_user_id", length = 64, nullable = false, columnDefinition = "varchar(64)")
	private String affUserId;

	@Basic(optional = false)
	@Column(name = "process_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	private Date processDatetime;

	@Basic(optional = false)
	@Column(name = "is_email_sent", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
	@Enumerated(EnumType.STRING)
	private StateType isEmailSent = StateType.N;

	@Basic(optional = false)
	@Column(name = "is_sms_sent", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
	@Enumerated(EnumType.STRING)
	private StateType isSmsSent;

	@Basic(optional = false)
	@Column(name = "is_email_retry", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
	@Enumerated(EnumType.STRING)
	private StateType isEmailRetry;

	@Basic(optional = false)
	@Column(name = "is_sms_retry", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
	@Enumerated(EnumType.STRING)
	private StateType isSmsRetry;

	@Column(name = "retry_sms_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	private Date retrySmsDatetime;

	@Column(name = "retry_email_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	private Date retryEmailDatetime;

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

	public String getAffUserId() {
		return affUserId;
	}

	public void setAffUserId(String affUserId) {
		this.affUserId = affUserId;
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

	public Date getRetrySmsDatetime() {
		return retrySmsDatetime;
	}

	public void setRetrySmsDatetime(Date retrySmsDatetime) {
		this.retrySmsDatetime = retrySmsDatetime;
	}

	public Date getRetryEmailDatetime() {
		return retryEmailDatetime;
	}

	public void setRetryEmailDatetime(Date retryEmailDatetime) {
		this.retryEmailDatetime = retryEmailDatetime;
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
