package me.jtx.openapi.dinner.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 食物SKU。
 * 
 * @author huazhong
 * @date 2018/05/18
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_food_sku")
public class FoodSKU extends BaseEntity {

    private static final long serialVersionUID = -1611146919537786739L;

    /**
     * 食物
     */
    @Column(name = "food_id")
    private long foodId;
    /**
     * 属性搭配方式
     */
    @Column(name = "name")
    private String name;
    
    /**
     * 食物价格
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 食物原始价格
     */
    @Column(name = "original_price")
    private BigDecimal originalPrice;

    /**
     * 打包费
     */
    @Column(name = "packing_fee")
    private BigDecimal packingFee;
    /**
     * 库存
     */
    @Column(name = "stock")
    private int stock;
}
