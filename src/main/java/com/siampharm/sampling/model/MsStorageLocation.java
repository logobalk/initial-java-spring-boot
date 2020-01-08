package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MsStorageLocation generated by hbm2java
 */
@Entity
@Table(name = "ms_storage_location", schema = "bpi" )
public class MsStorageLocation implements java.io.Serializable {
	private static final long serialVersionUID = 2620159661845577905L;
	private Integer id;
	private MsPlant msPlant;
	private String locationCode;
	private String locationDesc;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private String plant;
	private String plantName;
	private Set<AvailableBin> availableBins = new HashSet<AvailableBin>(0);
	private Set<PoItemsQi> poItemsQis = new HashSet<PoItemsQi>(0);
	private Set<PoItemsQiRelease> poItemsQiReleases = new HashSet<PoItemsQiRelease>(0);

	public MsStorageLocation() {
	}

	public MsStorageLocation(Integer id, MsPlant msPlant) {
		this.id = id;
		this.msPlant = msPlant;
	}

	public MsStorageLocation(Integer id, MsPlant msPlant,String locationCode, String locationDesc,
			Boolean isDeleted, String createdBy, Date createdDate, String updatedBy, Date updatedDate, String plant,
			String plantName, Set<AvailableBin> availableBins, Set<PoItemsQi> poItemsQis,
			 Set<PoItemsQiRelease> poItemsQiReleases
			) {
		this.id = id;
		this.msPlant = msPlant;
		this.locationCode = locationCode;
		this.locationDesc = locationDesc;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.plant = plant;
		this.plantName = plantName;
		this.availableBins = availableBins;
		this.poItemsQis = poItemsQis;
		this.poItemsQiReleases = poItemsQiReleases;
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
	@JoinColumn(name = "plant_id", nullable = false)
	public MsPlant getMsPlant() {
		return this.msPlant;
	}

	public void setMsPlant(MsPlant msPlant) {
		this.msPlant = msPlant;
	}

	@Column(name = "location_code", length = 4)
	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	@Column(name = "location_desc", length = 150)
	public String getLocationDesc() {
		return this.locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
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

	@Column(name = "plant", length = 4)
	public String getPlant() {
		return this.plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	@Column(name = "plant_name", length = 150)
	public String getPlantName() {
		return this.plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msStorageLocation")
	public Set<AvailableBin> getAvailableBins() {
		return this.availableBins;
	}

	public void setAvailableBins(Set<AvailableBin> availableBins) {
		this.availableBins = availableBins;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msStorageLocation")
	public Set<PoItemsQi> getPoItemsQis() {
		return this.poItemsQis;
	}

	public void setPoItemsQis(Set<PoItemsQi> poItemsQis) {
		this.poItemsQis = poItemsQis;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "msStorageLocation")
	public Set<PoItemsQiRelease> getPoItemsQiReleases() {
		return this.poItemsQiReleases;
	}

	public void setPoItemsQiReleases(Set<PoItemsQiRelease> poItemsQiReleases) {
		this.poItemsQiReleases = poItemsQiReleases;
	}
}
