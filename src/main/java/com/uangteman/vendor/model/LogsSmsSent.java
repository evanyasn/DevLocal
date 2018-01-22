package com.uangteman.vendor.model;

import com.uangteman.vendor.model.constant.SourceSmsType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsSmsSent
 */

@Entity
@Table(name = "logs_sms_sent")
public class LogsSmsSent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "sender", nullable = false, length = 32, columnDefinition = "varchar(32) default ''")
    private String sender;

    @Basic(optional = false)
    @Column(name = "origin", nullable = false, columnDefinition = "ENUM('1','2','3','4','5') default 2")
    @Enumerated(EnumType.STRING)
    private SourceSmsType origin = SourceSmsType.WORKBENCH;

    @Basic(optional = false)
    @Column(name = "destination", nullable = false, length = 16, columnDefinition = "varchar(16) default ''")
    private String destination;

    @Basic(optional = false)
    @Column(name = "on_time", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date onTime;

    @Column(name = "content", nullable = false, length = 500, columnDefinition = "varchar(500) default ''")
    private String content;

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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public SourceSmsType getOrigin() {
        return origin;
    }

    public void setOrigin(SourceSmsType origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getOnTime() {
        return onTime;
    }

    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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