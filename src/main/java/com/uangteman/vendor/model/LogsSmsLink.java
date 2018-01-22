package com.uangteman.vendor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.uangteman.common.model.constant.StateType;

/**
 * LogsSmsLink
 */

@Entity
@Table(name = "logs_sms_link")
public class LogsSmsLink implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
	@GeneratedValue(generator = "custom_id_generator")
	@Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
	private String id;

	@Basic(optional = false)
	@Column(name = "phone_number", length = 255, nullable = false, columnDefinition = "varchar(255)")
	private String phoneNumber;

	@Column(name = "ip_address", length = 20, nullable = true, columnDefinition = "varchar(20) default NULL")
	private String ipAddress;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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