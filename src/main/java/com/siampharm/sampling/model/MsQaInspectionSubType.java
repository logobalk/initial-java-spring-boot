package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;

/**
 * MsQaInspectionSubType generated by hbm2java
 */
@Entity
@Table(name = "ms_qa_inspection_sub_type", schema = "bpi" )
public class MsQaInspectionSubType implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private MsQaInspectionType msQaInspectionType;
	private Integer parentId;
	private String code;
	private String name;
	private Boolean isDefault;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public MsQaInspectionSubType() {
	}

	public MsQaInspectionSubType(Integer id) {
		this.id = id;
	}

	public MsQaInspectionSubType(Integer id, MsQaInspectionType msQaInspectionType, Integer parentId, String code,
			String name, Boolean isDefault, Boolean isDeleted, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		this.id = id;
		this.msQaInspectionType = msQaInspectionType;
		this.parentId = parentId;
		this.code = code;
		this.name = name;
		this.isDefault = isDefault;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ms_qa_inspection_type_id")
	public MsQaInspectionType getMsQaInspectionType() {
		return this.msQaInspectionType;
	}

	public void setMsQaInspectionType(MsQaInspectionType msQaInspectionType) {
		this.msQaInspectionType = msQaInspectionType;
	}

	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "code", length = 18)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name", length = 150)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "is_default")
	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "created_by", length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 23)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by", length = 50)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 23)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}