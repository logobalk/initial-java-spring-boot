package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MsInspectionGroup generated by hbm2java
 */
@Entity
@Table(name = "ms_inspection_group", schema = "bpi" )
public class MsInspectionGroup implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private String inspectionGroup;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Boolean spDisplayFlag;
	private Boolean sbDisplayFlag;
	private Set<MsInspection> msInspections = new HashSet<MsInspection>(0);

	public MsInspectionGroup() {
	}

	public MsInspectionGroup(Integer id) {
		this.id = id;
	}

	public MsInspectionGroup(Integer id, String inspectionGroup, Boolean isDeleted, String createdBy, Date createdDate,
			String updatedBy, Date updatedDate, Boolean spDisplayFlag, Boolean sbDisplayFlag,
			Set<MsInspection> msInspections) {
		this.id = id;
		this.inspectionGroup = inspectionGroup;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.spDisplayFlag = spDisplayFlag;
		this.sbDisplayFlag = sbDisplayFlag;
		this.msInspections = msInspections;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "inspection_group", length = 50)
	public String getInspectionGroup() {
		return this.inspectionGroup;
	}

	public void setInspectionGroup(String inspectionGroup) {
		this.inspectionGroup = inspectionGroup;
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

	@Column(name = "sp_display_flag")
	public Boolean getSpDisplayFlag() {
		return this.spDisplayFlag;
	}

	public void setSpDisplayFlag(Boolean spDisplayFlag) {
		this.spDisplayFlag = spDisplayFlag;
	}

	@Column(name = "sb_display_flag")
	public Boolean getSbDisplayFlag() {
		return this.sbDisplayFlag;
	}

	public void setSbDisplayFlag(Boolean sbDisplayFlag) {
		this.sbDisplayFlag = sbDisplayFlag;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msInspectionGroup")
	public Set<MsInspection> getMsInspections() {
		return this.msInspections;
	}

	public void setMsInspections(Set<MsInspection> msInspections) {
		this.msInspections = msInspections;
	}

}
