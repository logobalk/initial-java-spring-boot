package com.siampharm.sampling.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class MaterialIdentity implements Serializable {
    private static final long serialVersionUID = -7525776154379198213L;

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "material_id")
    Integer materialId;

    @Column(name = "plant_id")
    Integer plantId;

    @Column(name = "temp_condition")
    String tempCondition;

    @Column(name = "spectial_condition1")
    String spectialCondition1;

    @Column(name = "spectial_condition2")
    String spectialCondition2;

    @Column(name = "spectial_condition3")
    String spectialCondition3;

    @Column(name = "spectial_condition4")
    String spectialCondition4;

    @Column(name = "spectial_condition5")
    String spectialCondition5;

    @Column(name = "spectial_condition6")
    String spectialCondition6;

    @Column(name = "spectial_condition7")
    String spectialCondition7;

    @Column(name = "spectial_condition8")
    String spectialCondition8;

    @Column(name = "MSDS_No")
    String msdsNo;

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
        this.id = id;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getTempCondition() {
        return tempCondition;
    }

    public void setTempCondition(String tempCondition) {
        this.tempCondition = tempCondition;
    }

    public String getSpectialCondition1() {
        return spectialCondition1;
    }

    public void setSpectialCondition1(String spectialCondition1) {
        this.spectialCondition1 = spectialCondition1;
    }

    public String getSpectialCondition2() {
        return spectialCondition2;
    }

    public void setSpectialCondition2(String spectialCondition2) {
        this.spectialCondition2 = spectialCondition2;
    }

    public String getSpectialCondition3() {
        return spectialCondition3;
    }

    public void setSpectialCondition3(String spectialCondition3) {
        this.spectialCondition3 = spectialCondition3;
    }

    public String getSpectialCondition4() {
        return spectialCondition4;
    }

    public void setSpectialCondition4(String spectialCondition4) {
        this.spectialCondition4 = spectialCondition4;
    }

    public String getSpectialCondition5() {
        return spectialCondition5;
    }

    public void setSpectialCondition5(String spectialCondition5) {
        this.spectialCondition5 = spectialCondition5;
    }

    public String getSpectialCondition6() {
        return spectialCondition6;
    }

    public void setSpectialCondition6(String spectialCondition6) {
        this.spectialCondition6 = spectialCondition6;
    }

    public String getSpectialCondition7() {
        return spectialCondition7;
    }

    public void setSpectialCondition7(String spectialCondition7) {
        this.spectialCondition7 = spectialCondition7;
    }

    public String getSpectialCondition8() {
        return spectialCondition8;
    }

    public void setSpectialCondition8(String spectialCondition8) {
        this.spectialCondition8 = spectialCondition8;
    }

    public String getMsdsNo() {
        return msdsNo;
    }

    public void setMsdsNo(String msdsNo) {
        this.msdsNo = msdsNo;
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
