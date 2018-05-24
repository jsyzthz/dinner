package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author huazhong
 * @date 2018/05/24
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_food_attr_value")
public class FoodAttrValue extends BaseEntity {

    private static final long serialVersionUID = 3332676567824723498L;

    /**
     * 食物
     */
    @Column(name = "food_id")
    private long foodId;
    
    /**
     * 食物属性
     */
    @Column(name = "food_attr_key_id")
    private long foodAttrKeyId;
    
    /**
     * 属性编码
     */
    @Column(name = "symbol")
    private int symbol;
    
    /**
     * 属性值
     */
    @Column(name = "attr_value")
    private String attrValue;
}
