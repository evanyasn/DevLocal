package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * LogsReportSms
 */
@Entity
@Table(name = "logs_report_sms")
public class LogsReportSms implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Column(name = "type", length = 100, nullable = true, columnDefinition = "varchar(100) default NULL")
    private String type;

    @Column(name = "loan_id", length = 60, nullable = true, columnDefinition = "varchar(60) default NULL")
    private String loanId;

    @Column(name = "trx_no", length = 10, nullable = true, columnDefinition = "bigint(10) default NULL")
    private Integer trxNo;

    @Column(name = "sender", length = 24, nullable = true, columnDefinition = "varchar(24) default NULL")
    private String sender;

    @Column(name = "receiver", length = 24, nullable = true, columnDefinition = "varchar(24) default NULL")
    private String receiver;

    @Lob
    @Column(name = "body", nullable = true, columnDefinition = "text")
    private String body;

    @Column(name = "is_sent", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isSent = StateType.N;

    @Column(name = "sent_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date sentDatetime;

    @Column(name = "is_retry", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isRetry;

    @Column(name = "retry_datetime", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date retryDatetime;

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


}