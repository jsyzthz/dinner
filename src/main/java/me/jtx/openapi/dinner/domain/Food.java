package me.jtx.openapi.dinner.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class Food extends BaseEntity {

	private static final long serialVersionUID = -8503311528231535450L;

	// 食物描述
	@Column(name = "description")
	private String description;

	// 食物名
	@Column(name = "name")
	private String name;

	// 食物图片
	@Column(name = "image_url")
	private String imageUrl;

	// 是否招牌菜
	@Column(name = "is_featured")
	private boolean isFeatured;

	// 是否配菜
	@Column(name = "is_gum")
	private boolean isGum;

	// 是否新菜
	@Column(name = "is_new")
	private boolean isNew;

	// 是否辣
	@Column(name = "is_spicy")
	private boolean isSpicy;

	// 1-5星评价
	@Column(name = "num_rating")
	private int numRating;

	// 食物价格
	@Column(name = "price")
	private BigDecimal price;

	// 食物原始价格
	@Column(name = "original_price")
	private BigDecimal originalPrice;

	// 打包费
	@Column(name = "packing_fee")
	private BigDecimal packingFee;

	// 名称 pinyin
	@Column(name = "pinyin_name")
	private String pinyinName;

	// 排序 id
	@Column(name = "sort_order")
	private int sortOrder;

	// 规格说明
	@Column(name = "spec_values")
	private int specValues;

	// 食物的规格信息
	@Column(name = "specs")
	private String specs;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public boolean isGum() {
		return isGum;
	}

	public void setGum(boolean isGum) {
		this.isGum = isGum;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public boolean isSpicy() {
		return isSpicy;
	}

	public void setSpicy(boolean isSpicy) {
		this.isSpicy = isSpicy;
	}

	public int getNumRating() {
		return numRating;
	}

	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getPackingFee() {
		return packingFee;
	}

	public void setPackingFee(BigDecimal packingFee) {
		this.packingFee = packingFee;
	}

	public String getPinyinName() {
		return pinyinName;
	}

	public void setPinyinName(String pinyinName) {
		this.pinyinName = pinyinName;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getSpecValues() {
		return specValues;
	}

	public void setSpecValues(int specValues) {
		this.specValues = specValues;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

}
