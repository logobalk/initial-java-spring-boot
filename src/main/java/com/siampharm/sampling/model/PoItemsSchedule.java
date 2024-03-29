package com.siampharm.sampling.model;
// Generated Feb 25, 2019 2:45:54 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PoItemsSchedule generated by hbm2java
 */
@Entity
@Table(name = "po_items_schedule", schema = "bpi" )
public class PoItemsSchedule implements java.io.Serializable {

	private Integer id;
	private PoItems poItems;
	private Integer lineItem;
	private Date deliveryScheduleDate;
	private BigDecimal deliveryScheduleQuantity;
	private String deliveryAddress;
	private Integer dsLineItem;
	private Date dsCommitDate;
	private BigDecimal dsCommitQty;
	private String shippingInstruction;
	private String deletionFlag;
	private String countryOfOrigin;
	private String manufacturer;
	private String sorTor;
	private BigDecimal deliveryQuantity;
	private String remark;
	private Boolean isClosed;
	private Date closedDate;
	private String closedBy;
	private String changeRemark;
	private Boolean isDeleted;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Set<PoItemInspection> poItemInspections = new HashSet<PoItemInspection>(0);
	private Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId = new HashSet<PoMatchItems>(0);
	private Set<PoItemsIssues> poItemsIssueses = new HashSet<PoItemsIssues>(0);
	private Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId = new HashSet<PoMatchItems>(0);
	private Set<PoItemsScheduleDnBatch> poItemsScheduleDnBatches = new HashSet<PoItemsScheduleDnBatch>(0);
	private Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId_1 = new HashSet<PoMatchItems>(0);
	private Set<PoItemsQi> poItemsQis = new HashSet<PoItemsQi>(0);
	private Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId_1 = new HashSet<PoMatchItems>(0);

	public PoItemsSchedule() {
	}

	public PoItemsSchedule(Integer id, PoItems poItems, Integer lineItem, Boolean isDeleted, Date createdDate) {
		this.id = id;
		this.poItems = poItems;
		this.lineItem = lineItem;
		this.isDeleted = isDeleted;
		this.createdDate = createdDate;
	}

	public PoItemsSchedule(Integer id, PoItems poItems, Integer lineItem, Date deliveryScheduleDate,
			BigDecimal deliveryScheduleQuantity, String deliveryAddress, Integer dsLineItem, Date dsCommitDate,
			BigDecimal dsCommitQty, String shippingInstruction, String deletionFlag, String countryOfOrigin,
			String manufacturer, String sorTor, BigDecimal deliveryQuantity, String remark, Boolean isClosed,
			Date closedDate, String closedBy, String changeRemark, Boolean isDeleted, String createdBy,
			Date createdDate, String updatedBy, Date updatedDate,
			Set<PoItemInspection> poItemInspections,
			Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId, Set<PoItemsIssues> poItemsIssueses,
			Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId, Set<PoItemsScheduleDnBatch> poItemsScheduleDnBatches,
			Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId_1, Set<PoItemsQi> poItemsQis,
			Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId_1) {
		this.id = id;
		this.poItems = poItems;
		this.lineItem = lineItem;
		this.deliveryScheduleDate = deliveryScheduleDate;
		this.deliveryScheduleQuantity = deliveryScheduleQuantity;
		this.deliveryAddress = deliveryAddress;
		this.dsLineItem = dsLineItem;
		this.dsCommitDate = dsCommitDate;
		this.dsCommitQty = dsCommitQty;
		this.shippingInstruction = shippingInstruction;
		this.deletionFlag = deletionFlag;
		this.countryOfOrigin = countryOfOrigin;
		this.manufacturer = manufacturer;
		this.sorTor = sorTor;
		this.deliveryQuantity = deliveryQuantity;
		this.remark = remark;
		this.isClosed = isClosed;
		this.closedDate = closedDate;
		this.closedBy = closedBy;
		this.changeRemark = changeRemark;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.poItemInspections = poItemInspections;
		this.poMatchItemsesForSpPoItemScheduleId = poMatchItemsesForSpPoItemScheduleId;
		this.poItemsIssueses = poItemsIssueses;
		this.poMatchItemsesForSbPoItemScheduleId = poMatchItemsesForSbPoItemScheduleId;
		this.poItemsScheduleDnBatches = poItemsScheduleDnBatches;
		this.poMatchItemsesForSbPoItemScheduleId_1 = poMatchItemsesForSbPoItemScheduleId_1;
		this.poItemsQis = poItemsQis;
		this.poMatchItemsesForSpPoItemScheduleId_1 = poMatchItemsesForSpPoItemScheduleId_1;
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
	@JoinColumn(name = "po_items_id", nullable = false)
	public PoItems getPoItems() {
		return this.poItems;
	}

	public void setPoItems(PoItems poItems) {
		this.poItems = poItems;
	}

	@Column(name = "line_item", nullable = false)
	public Integer getLineItem() {
		return this.lineItem;
	}

	public void setLineItem(Integer lineItem) {
		this.lineItem = lineItem;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "delivery_schedule_date", length = 10)
	public Date getDeliveryScheduleDate() {
		return this.deliveryScheduleDate;
	}

	public void setDeliveryScheduleDate(Date deliveryScheduleDate) {
		this.deliveryScheduleDate = deliveryScheduleDate;
	}

	@Column(name = "delivery_schedule_quantity", precision = 16, scale = 3)
	public BigDecimal getDeliveryScheduleQuantity() {
		return this.deliveryScheduleQuantity;
	}

	public void setDeliveryScheduleQuantity(BigDecimal deliveryScheduleQuantity) {
		this.deliveryScheduleQuantity = deliveryScheduleQuantity;
	}

	@Column(name = "delivery_address", length = 10)
	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Column(name = "ds_line_item")
	public Integer getDsLineItem() {
		return this.dsLineItem;
	}

	public void setDsLineItem(Integer dsLineItem) {
		this.dsLineItem = dsLineItem;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ds_commit_date", length = 10)
	public Date getDsCommitDate() {
		return this.dsCommitDate;
	}

	public void setDsCommitDate(Date dsCommitDate) {
		this.dsCommitDate = dsCommitDate;
	}

	@Column(name = "ds_commit_qty", precision = 16, scale = 3)
	public BigDecimal getDsCommitQty() {
		return this.dsCommitQty;
	}

	public void setDsCommitQty(BigDecimal dsCommitQty) {
		this.dsCommitQty = dsCommitQty;
	}

	@Column(name = "shipping_instruction", length = 2)
	public String getShippingInstruction() {
		return this.shippingInstruction;
	}

	public void setShippingInstruction(String shippingInstruction) {
		this.shippingInstruction = shippingInstruction;
	}

	@Column(name = "deletion_flag", length = 1)
	public String getDeletionFlag() {
		return this.deletionFlag;
	}

	public void setDeletionFlag(String deletionFlag) {
		this.deletionFlag = deletionFlag;
	}

	@Column(name = "country_of_origin", length = 50)
	public String getCountryOfOrigin() {
		return this.countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Column(name = "manufacturer", length = 50)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "sor_tor", length = 50)
	public String getSorTor() {
		return this.sorTor;
	}

	public void setSorTor(String sorTor) {
		this.sorTor = sorTor;
	}

	@Column(name = "delivery_quantity", precision = 16, scale = 3)
	public BigDecimal getDeliveryQuantity() {
		return this.deliveryQuantity;
	}

	public void setDeliveryQuantity(BigDecimal deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "is_closed")
	public Boolean getIsClosed() {
		return this.isClosed;
	}

	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "closed_date", length = 23)
	public Date getClosedDate() {
		return this.closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	@Column(name = "closed_by", length = 50)
	public String getClosedBy() {
		return this.closedBy;
	}

	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}

	@Column(name = "change_remark", length = 250)
	public String getChangeRemark() {
		return this.changeRemark;
	}

	public void setChangeRemark(String changeRemark) {
		this.changeRemark = changeRemark;
	}

	@Column(name = "is_deleted", nullable = false)
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
	@Column(name = "created_date", nullable = false, length = 23)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsSchedule")
	public Set<PoItemInspection> getPoItemInspections() {
		return this.poItemInspections;
	}

	public void setPoItemInspections(Set<PoItemInspection> poItemInspections) {
		this.poItemInspections = poItemInspections;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsScheduleBySpPoItemScheduleId")
	public Set<PoMatchItems> getPoMatchItemsesForSpPoItemScheduleId() {
		return this.poMatchItemsesForSpPoItemScheduleId;
	}

	public void setPoMatchItemsesForSpPoItemScheduleId(Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId) {
		this.poMatchItemsesForSpPoItemScheduleId = poMatchItemsesForSpPoItemScheduleId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsSchedule")
	public Set<PoItemsIssues> getPoItemsIssueses() {
		return this.poItemsIssueses;
	}

	public void setPoItemsIssueses(Set<PoItemsIssues> poItemsIssueses) {
		this.poItemsIssueses = poItemsIssueses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsScheduleBySbPoItemScheduleId")
	public Set<PoMatchItems> getPoMatchItemsesForSbPoItemScheduleId() {
		return this.poMatchItemsesForSbPoItemScheduleId;
	}

	public void setPoMatchItemsesForSbPoItemScheduleId(Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId) {
		this.poMatchItemsesForSbPoItemScheduleId = poMatchItemsesForSbPoItemScheduleId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsSchedule")
	public Set<PoItemsScheduleDnBatch> getPoItemsScheduleDnBatches() {
		return this.poItemsScheduleDnBatches;
	}

	public void setPoItemsScheduleDnBatches(Set<PoItemsScheduleDnBatch> poItemsScheduleDnBatches) {
		this.poItemsScheduleDnBatches = poItemsScheduleDnBatches;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsScheduleBySbPoItemScheduleId")
	public Set<PoMatchItems> getPoMatchItemsesForSbPoItemScheduleId_1() {
		return this.poMatchItemsesForSbPoItemScheduleId_1;
	}

	public void setPoMatchItemsesForSbPoItemScheduleId_1(Set<PoMatchItems> poMatchItemsesForSbPoItemScheduleId_1) {
		this.poMatchItemsesForSbPoItemScheduleId_1 = poMatchItemsesForSbPoItemScheduleId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsSchedule")
	public Set<PoItemsQi> getPoItemsQis() {
		return this.poItemsQis;
	}

	public void setPoItemsQis(Set<PoItemsQi> poItemsQis) {
		this.poItemsQis = poItemsQis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "poItemsScheduleBySpPoItemScheduleId")
	public Set<PoMatchItems> getPoMatchItemsesForSpPoItemScheduleId_1() {
		return this.poMatchItemsesForSpPoItemScheduleId_1;
	}

	public void setPoMatchItemsesForSpPoItemScheduleId_1(Set<PoMatchItems> poMatchItemsesForSpPoItemScheduleId_1) {
		this.poMatchItemsesForSpPoItemScheduleId_1 = poMatchItemsesForSpPoItemScheduleId_1;
	}

}
