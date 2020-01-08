package com.siampharm.sampling.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "material", schema = "bpi")
public class Material implements Serializable {
    private static final long serialVersionUID = -5559630141401255247L;

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "mat_code")
    String matCode;

    @Column(name = "mat_desc")
    String matDesc;

    @Column(name = "mat_group_id")
    Integer matGroupId;

    @Column(name = "mat_type_id")
    Integer matTypeId;

    @Column(name = "is_deleted")
    Boolean isDeleted;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "created_date")
    Timestamp createdDate;

    @Column(name = "updated_by")
    String updatedBy;

    @Column(name = "updated_date")
    Timestamp updatedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode;
    }

    public String getMatDesc() {
        return matDesc;
    }

    public void setMatDesc(String matDesc) {
        this.matDesc = matDesc;
    }

    public Integer getMatGroupId() {
        return matGroupId;
    }

    public void setMatGroupId(Integer matGroupId) {
        this.matGroupId = matGroupId;
    }

    public Integer getMatTypeId() {
        return matTypeId;
    }

    public void setMatTypeId(Integer matTypeId) {
        this.matTypeId = matTypeId;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
