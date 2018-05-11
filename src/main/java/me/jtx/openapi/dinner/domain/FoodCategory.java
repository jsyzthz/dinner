package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "food_category")
public class FoodCategory extends BaseEntity {

	private static final long serialVersionUID = -4028737543343949532L;

	// 食物分类名
	@Column(name = "name")
	private String name;

	// 食物是否有效
	@Column(name = "is_valid")
	private boolean isValid;

	// 食物分类权重，数值越大，在菜单中的排序就越靠前
	@Column(name = "weight")
	private int weight;

	// 分类描述
	@Column(name = "description")
	private String description;

	// 店铺 ID
	@Column(name = "restaurant_id")
	private long restaurantId;

	// 分时展示内容
	@Column(name = "display_attribute")
	private String displayAttribute;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getDisplayAttribute() {
		return displayAttribute;
	}

	public void setDisplayAttribute(String displayAttribute) {
		this.displayAttribute = displayAttribute;
	}
}
