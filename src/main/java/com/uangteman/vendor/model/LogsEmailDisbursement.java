package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "logs_email_disbursement")
public class LogsEmailDisbursement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Basic(optional = false)
    @Column(name = "date", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
    private Date date;

    @Lob
    @Column(name = "content", nullable = false, columnDefinition = "text")
    private String content;

    @Column(name = "is_delivered", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType is_delivered = StateType.N;

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
