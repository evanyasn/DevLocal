package com.uangteman.vendor.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsSmsReceived
 */
@Entity
@Table(name = "logs_sms_received")
public class LogsSmsReceived implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "origin", length = 16, nullable = false, columnDefinition = "varchar(16) default ''")
    private String origin;

    @Basic(optional = false)
    @Column(name = "content", length = 160, nullable = false, columnDefinition = "varchar(160)")
    private String content;

    @Basic(optional = false)
    @Column(name = "at_time", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date atTime;

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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAtTime() {
        return atTime;
    }

    public void setAtTime(Date atTime) {
        this.atTime = atTime;
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