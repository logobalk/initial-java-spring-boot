package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;

/**
 * PoCompleteLog generated by hbm2java
 */
@Entity
@Table(name = "po_complete_log", schema = "bpi" )
public class PoCompleteLog implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private Integer plantId;
	private String poNumber;
	private Integer lineItem;
	private Boolean status;
	private String remark;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public PoCompleteLog() {
	}

	public PoCompleteLog(Integer id) {
		this.id = id;
	}

	public PoCompleteLog(Integer id, Integer plantId, String poNumber, Integer lineItem, Boolean status, String remark,
			Boolean isDeleted, String createdBy, Date createdDate, String updatedBy, Date updatedDate) {
		this.id = id;
		this.plantId = plantId;
		this.poNumber = poNumber;
		this.lineItem = lineItem;
		this.status = status;
		this.remark = remark;
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

	@Column(name = "plant_id")
	public Integer getPlantId() {
		return this.plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	@Column(name = "po_number", length = 10)
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Column(name = "line_item")
	public Integer getLineItem() {
		return this.lineItem;
	}

	public void setLineItem(Integer lineItem) {
		this.lineItem = lineItem;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "remark", length = 550)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
