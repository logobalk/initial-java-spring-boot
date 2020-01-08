package com.siampharm.sampling.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "material_type", schema = "bpi")
public class MaterialType implements Serializable {

    private static final long serialVersionUID = 2620159661845577905L;

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "mat_type_code")
    String matTypeCode;

    @Column(name = "mat_type_desc")
    String matTypeDesc;

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

    public String getMatTypeCode() {
        return matTypeCode;
    }

    public void setMatTypeCode(String matTypeCode) {
        this.matTypeCode = matTypeCode;
    }

    public String getMatTypeDesc() {
        return matTypeDesc;
    }

    public void setMatTypeDesc(String matTypeDesc) {
        this.matTypeDesc = matTypeDesc;
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
