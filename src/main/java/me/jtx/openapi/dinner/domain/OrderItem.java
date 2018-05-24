package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Order item entity.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_order_item")
public class OrderItem extends BaseEntity {

    private static final long serialVersionUID = -8613809295972900437L;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "status")
    private String status;

    public long getOrderId() {
        return orderId;
    }
}
