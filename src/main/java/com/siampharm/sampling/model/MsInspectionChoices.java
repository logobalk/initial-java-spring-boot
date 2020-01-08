package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;

/**
 * MsInspectionChoices generated by hbm2java
 */
@Entity
@Table(name = "ms_inspection_choices", schema = "bpi" )
public class MsInspectionChoices implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private MsInspection msInspection;
	private Integer value;
	private String caption;
	private String extendType;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Boolean spDisplayFlag;
	private Boolean sbDisplayFlag;
	private Integer seq;
	private String suffixLabel;

	public MsInspectionChoices() {
	}

	public MsInspectionChoices(Integer id) {
		this.id = id;
	}

	public MsInspectionChoices(Integer id, MsInspection msInspection, Integer value, String caption, String extendType,
			Boolean isDeleted, String createdBy, Date createdDate, String updatedBy, Date updatedDate,
			Boolean spDisplayFlag, Boolean sbDisplayFlag, Integer seq, String suffixLabel) {
		this.id = id;
		this.msInspection = msInspection;
		this.value = value;
		this.caption = caption;
		this.extendType = extendType;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.spDisplayFlag = spDisplayFlag;
		this.sbDisplayFlag = sbDisplayFlag;
		this.seq = seq;
		this.suffixLabel = suffixLabel;
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

	@Column(name = "value")
	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Column(name = "caption", length = 150)
	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Column(name = "extend_type", length = 50)
	public String getExtendType() {
		return this.extendType;
	}

	public void setExtendType(String extendType) {
		this.extendType = extendType;
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

	@Column(name = "seq")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "suffix_label", length = 100)
	public String getSuffixLabel() {
		return this.suffixLabel;
	}

	public void setSuffixLabel(String suffixLabel) {
		this.suffixLabel = suffixLabel;
	}

}
