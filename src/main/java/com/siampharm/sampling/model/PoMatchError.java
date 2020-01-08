package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;

/**
 * PoMatchError generated by hbm2java
 */
@Entity
@Table(name = "po_match_error", schema = "bpi" )
public class PoMatchError implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private String poNumber;
	private String lineItem;
	private String referenceValue;
	private String message;
	private String companyCode;
	private Date matchDate;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public PoMatchError() {
	}

	public PoMatchError(Integer id) {
		this.id = id;
	}

	public PoMatchError(Integer id, String poNumber, String lineItem, String referenceValue, String message,
			String companyCode, Date matchDate, Boolean isDeleted, String createdBy, Date createdDate, String updatedBy,
			Date updatedDate) {
		this.id = id;
		this.poNumber = poNumber;
		this.lineItem = lineItem;
		this.referenceValue = referenceValue;
		this.message = message;
		this.companyCode = companyCode;
		this.matchDate = matchDate;
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

	@Column(name = "po_number", length = 10)
	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@Column(name = "line_item", length = 5)
	public String getLineItem() {
		return this.lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	@Column(name = "reference_value", length = 20)
	public String getReferenceValue() {
		return this.referenceValue;
	}

	public void setReferenceValue(String referenceValue) {
		this.referenceValue = referenceValue;
	}

	@Column(name = "message", length = 550)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "company_code", length = 4)
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "match_date", length = 23)
	public Date getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
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
