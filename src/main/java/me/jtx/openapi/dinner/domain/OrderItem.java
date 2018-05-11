package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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

	public void setOrderId(final long orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(final int userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("%s, order_id: %s, user_id: %s, status: %s", super.toString(), orderId, userId, status);
	}
}
