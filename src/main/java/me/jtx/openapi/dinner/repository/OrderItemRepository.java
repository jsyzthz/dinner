package me.jtx.openapi.dinner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.jtx.openapi.dinner.domain.OrderItem;

/**
 * Order iteam repository.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}