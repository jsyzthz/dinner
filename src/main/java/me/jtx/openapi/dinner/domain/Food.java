package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Food entity.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_food")
public class Food extends BaseEntity {

    private static final long serialVersionUID = -8503311528231535450L;

    /**
     * 食物描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 食物名
     */
    @Column(name = "name")
    private String name;

    /**
     * 食物图片
     */
    @Column(name = "image_url")
    private String imageUrl;

    /**
     * 是否招牌菜
     */
    @Column(name = "is_featured")
    private boolean isFeatured;

    /**
     * 是否配菜
     */
    @Column(name = "is_gum")
    private boolean isGum;

    /**
     * 是否新菜
     */
    @Column(name = "is_new")
    private boolean isNew;

    /**
     * 是否辣
     */
    @Column(name = "is_spicy")
    private boolean isSpicy;

    /**
     * 1-5星评价
     */
    @Column(name = "num_rating")
    private int numRating;


    /**
     * 名称 pinyin
     */
    @Column(name = "pinyin_name")
    private String pinyinName;

    /**
     * 排序 id
     */
    @Column(name = "sort_order")
    private int sortOrder;
    
    @ManyToOne
    @JoinColumn(name = "food_category_id")
    private FoodCategory foodCategory;

//    /**
//     * 规格说明
//     */
//    @Column(name = "spec_values")
//    private int specValues;
//
//    /**
//     * 食物的规格信息
//     */
//    @Convert(converter = FoodSpecConverter.class)
//    @Column(name = "specs")
//    private FoodUnit specs;
}
