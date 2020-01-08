package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MsQiReason generated by hbm2java
 */
@Entity
@Table(name = "ms_qi_reason", schema = "bpi" )
public class MsQiReason implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private String reason;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Set<PoItemsQiReasonTr> poItemsQiReasonTrs = new HashSet<PoItemsQiReasonTr>(0);
	private Set<PoItemsQi> poItemsQis = new HashSet<PoItemsQi>(0);

	public MsQiReason() {
	}

	public MsQiReason(Integer id) {
		this.id = id;
	}

	public MsQiReason(Integer id, String reason, Boolean isDeleted, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate, Set<PoItemsQiReasonTr> poItemsQiReasonTrs, Set<PoItemsQi> poItemsQis) {
		this.id = id;
		this.reason = reason;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.poItemsQiReasonTrs = poItemsQiReasonTrs;
		this.poItemsQis = poItemsQis;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "reason", length = 100)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msQiReason")
	public Set<PoItemsQiReasonTr> getPoItemsQiReasonTrs() {
		return this.poItemsQiReasonTrs;
	}

	public void setPoItemsQiReasonTrs(Set<PoItemsQiReasonTr> poItemsQiReasonTrs) {
		this.poItemsQiReasonTrs = poItemsQiReasonTrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msQiReason")
	public Set<PoItemsQi> getPoItemsQis() {
		return this.poItemsQis;
	}

	public void setPoItemsQis(Set<PoItemsQi> poItemsQis) {
		this.poItemsQis = poItemsQis;
	}

}
