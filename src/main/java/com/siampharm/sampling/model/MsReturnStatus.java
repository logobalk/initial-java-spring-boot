package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MsReturnStatus generated by hbm2java
 */
@Entity
@Table(name = "ms_return_status", schema = "bpi" )
public class MsReturnStatus implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private String type;
	private String code;
	private String name;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Set<Po> pos = new HashSet<Po>(0);

	public MsReturnStatus() {
	}

	public MsReturnStatus(Integer id) {
		this.id = id;
	}

	public MsReturnStatus(Integer id, String type, String code, String name, Boolean isDeleted, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate, Set<Po> pos) {
		this.id = id;
		this.type = type;
		this.code = code;
		this.name = name;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.pos = pos;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type", length = 5)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msReturnStatus")
	public Set<Po> getPos() {
		return this.pos;
	}

	public void setPos(Set<Po> pos) {
		this.pos = pos;
	}

}