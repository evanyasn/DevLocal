package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsCallback
 */
@Entity
@Table(name = "logs_callback")
public class LogsCallback implements Serializable {
    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Column(name = "vendor_id", length = 32, nullable = false, columnDefinition = "varchar(32) default ''")
    private String vendorId;

    @Column(name = "from_ip", length = 15, nullable = false, columnDefinition = "varchar(15) default ''")
    private String fromIp;

    @Column(name = "on_date", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date onDate;

    @Column(name = "content", columnDefinition = "text", nullable = false)
    private String content;

    @Basic(optional = false)
    @Column(name = "is_valid", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isValid = StateType.N;

    @Column(name = "description", length = 128, nullable = true, columnDefinition = "varchar(128) default NULL")
    private String description;

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

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getFromIp() {
        return fromIp;
    }

    public void setFromIp(String fromIp) {
        this.fromIp = fromIp;
    }

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public StateType getIsValid() {
        return isValid;
    }

    public void setIsValid(StateType isValid) {
        this.isValid = isValid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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