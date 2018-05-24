package me.jtx.openapi.dinner.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Food category entity.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_food_category")
public class FoodCategory extends BaseEntity {

    private static final long serialVersionUID = -4028737543343949532L;

    /**
     * 食物分类名
     */
    @Column(name = "name")
    private String name;

    /**
     * 食物是否有效
     */
    @Column(name = "is_valid")
    private boolean isValid;

    /**
     * 食物分类权重，数值越大，在菜单中的排序就越靠前
     */
    @Column(name = "weight")
    private int weight;

    /**
     * 分类描述
     */
    @Column(name = "description")
    private String description;
    
    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private Set<Food> foods;

//    /**
//     * 店铺 ID
//     */
//    @Column(name = "restaurant_id")
//    private long restaurantId;
//
//    /**
//     * 分时展示内容
//     */
//    @Column(name = "display_attribute")
//    private String displayAttribute;
}
