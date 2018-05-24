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
@Table(name = "t_food_attr_key")
public class FoodAttrKey extends BaseEntity {

    private static final long serialVersionUID = 3332676567824723498L;

    /**
     * 食物
     */
    @Column(name = "food_id")
    private long foodId;
    
    /**
     * 属性名称
     */
    @Column(name = "attr_name")
    private String attrName;
}
