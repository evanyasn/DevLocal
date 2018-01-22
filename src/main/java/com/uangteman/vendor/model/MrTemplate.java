package com.uangteman.vendor.model;

import com.uangteman.common.model.constant.CategoryType;
import com.uangteman.common.model.constant.StateType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mr_template")
public class MrTemplate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;

    @Column(name = "name", length = 100, columnDefinition = "varchar(100)", nullable = false)
    private String name;

    @Column(name = "category", nullable = true, columnDefinition = "ENUM('EMAIL', 'SMS') default NULL")
    @Enumerated(EnumType.STRING)
    private CategoryType category;

    @Lob
    @Column(name = "desc_en", columnDefinition = "text")
    private String descEn;

    @Lob
    @Column(name = "desc_in", columnDefinition = "text")
    private String descIn;

    @Basic(optional = false)
    @Column(name = "state", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'Y'")
    @Enumerated(EnumType.STRING)
    private StateType state = StateType.Y;

    @Basic(optional = false)
    @Column(name = "is_delete", nullable = false, columnDefinition = "ENUM('Y', 'N') default 'N'")
    @Enumerated(EnumType.STRING)
    private StateType isDelete = StateType.N;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getDescIn() {
        return descIn;
    }

    public void setDescIn(String descIn) {
        this.descIn = descIn;
    }

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
    }

    public StateType getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(StateType isDelete) {
        this.isDelete = isDelete;
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
