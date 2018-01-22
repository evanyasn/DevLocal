package com.uangteman.vendor.model;

import com.uangteman.vendor.model.constant.KokattoSubApp;
import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "logs_kokatto")
public class LogsKokatto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "custom_id_generator", strategy = "com.uangteman.common.utils.CustomIdGenerator")
    @GeneratedValue(generator = "custom_id_generator")
    @Column(name = "id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String id;

    @Basic(optional = false)
    @Column(name = "ref_id", length = 28, nullable = false, columnDefinition = "varchar(28)")
    private String refId;

    @Basic(optional = false)
    @Column(name = "loan_id", length = 64, nullable = false, columnDefinition = "varchar(64)")
    private String loanId;

    @Basic(optional = false)
    @Column(name = "sub_app", columnDefinition = "ENUM('1', '2', '3', '4', '5', '6', '7', '8', '9', '10') default '6'", nullable = false)
    @Enumerated(EnumType.STRING)
    private KokattoSubApp subApp = KokattoSubApp.hmin1;

    @Column(name = "request_id", length = 64, nullable = true, columnDefinition = "varchar(64) default null")
    private String requestId;

    @Basic(optional = false)
    @Column(name = "request_date", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date requestDate;

    @Basic(optional = false)
    @Column(name = "is_sent", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isSent = StateType.N;

    @Column(name = "response_date", nullable = true, columnDefinition = "DATETIME DEFAULT NULL")
    private Date responseDate;

    @Lob
    @Column(name = "full_response", columnDefinition = "text")
    private String fullResponse;

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

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public KokattoSubApp getSubApp() {
        return subApp;
    }

    public void setSubApp(KokattoSubApp subApp) {
        this.subApp = subApp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public StateType getIsSent() {
        return isSent;
    }

    public void setIsSent(StateType isSent) {
        this.isSent = isSent;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getFullResponse() {
        return fullResponse;
    }

    public void setFullResponse(String fullResponse) {
        this.fullResponse = fullResponse;
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
