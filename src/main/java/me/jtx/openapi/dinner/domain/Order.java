package me.jtx.openapi.dinner.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Order entity.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
@Setter
@ToString(callSuper = true)
@Entity
@Table(name = "t_order")
public class Order extends BaseEntity {

    private static final long serialVersionUID = 3365838263698550715L;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "pay_price")
    private BigDecimal payPrice;

    @Column(name = "status")
    private String status;

    @Column(name = "payment_status")
    private PaymentStaus paymentStatus;
}
