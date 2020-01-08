package com.siampharm.sampling.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the material_group database table.
 * 
 */
@Entity
@Table(name="material_group", schema = "bpi")
public class MaterialGroup implements Serializable {

	private static final long serialVersionUID = 2014528732382096868L;

	@Id
	private Integer id;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="is_deleted")
	private boolean isDeleted;

	@Column(name="mat_group_code")
	private String matGroupCode;

	@Column(name="mat_group_desc")
	private String matGroupDesc;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="updated_date")
	private Timestamp updatedDate;

	public MaterialGroup() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getMatGroupCode() {
		return this.matGroupCode;
	}

	public void setMatGroupCode(String matGroupCode) {
		this.matGroupCode = matGroupCode;
	}

	public String getMatGroupDesc() {
		return this.matGroupDesc;
	}

	public void setMatGroupDesc(String matGroupDesc) {
		this.matGroupDesc = matGroupDesc;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}