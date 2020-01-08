package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;

/**
 * PoItemInspectionList generated by hbm2java
 */
@Entity
@Table(name = "po_item_inspection_list", schema = "bpi" )
public class PoItemInspectionList implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private MsInspection msInspection;
	private PoItemInspection poItemInspection;
	private String inspectionResult;
	private String extValue;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public PoItemInspectionList() {
	}

	public PoItemInspectionList(Integer id) {
		this.id = id;
	}

	public PoItemInspectionList(Integer id, MsInspection msInspection, PoItemInspection poItemInspection,
			String inspectionResult, String extValue, Boolean isDeleted, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate) {
		this.id = id;
		this.msInspection = msInspection;
		this.poItemInspection = poItemInspection;
		this.inspectionResult = inspectionResult;
		this.extValue = extValue;
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
	@JoinColumn(name = "inspection_id")
	public MsInspection getMsInspection() {
		return this.msInspection;
	}

	public void setMsInspection(MsInspection msInspection) {
		this.msInspection = msInspection;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "po_item_inspection_id")
	public PoItemInspection getPoItemInspection() {
		return this.poItemInspection;
	}

	public void setPoItemInspection(PoItemInspection poItemInspection) {
		this.poItemInspection = poItemInspection;
	}

	@Column(name = "inspection_result", length = 100)
	public String getInspectionResult() {
		return this.inspectionResult;
	}

	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}

	@Column(name = "ext_value", length = 200)
	public String getExtValue() {
		return this.extValue;
	}

	public void setExtValue(String extValue) {
		this.extValue = extValue;
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