package com.uangteman.vendor.model;

import com.uangteman.vendor.model.constant.FileExtensionType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsReportExportFile
 */
@Entity
@Table(name = "logs_report_exportfile")
public class LogsReportExportFile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "user_id", nullable = false, length = 11, columnDefinition = "int(11)")
    private Integer userId;

    @Basic(optional = false)
    @Column(name = "user_email", nullable = false, length = 100, columnDefinition = "varchar(100)")
    private String userEmail;

    @Basic(optional = false)
    @Column(name = "filename", nullable = false, length = 100, columnDefinition = "varchar(100)")
    private String filename;

    @Column(name = "extension", nullable = true, columnDefinition = "ENUM('PDF', 'XLS', 'XLSX', 'CSV') default NULL")
    @Enumerated(EnumType.STRING)
    private FileExtensionType extension;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FileExtensionType getExtension() {
        return extension;
    }

    public void setExtension(FileExtensionType extension) {
        this.extension = extension;
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