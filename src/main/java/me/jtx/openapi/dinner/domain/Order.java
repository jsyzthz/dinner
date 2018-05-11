package me.jtx.openapi.dinner.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_order")
public class Order extends BaseEntity {

	private static final long serialVersionUID = 3365838263698550715L;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "status")
	private String status;

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
		return String.format("%s,user_id: %s, status: %s", super.toString(), userId, status);
	}
}
