package me.jtx.openapi.dinner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.jtx.openapi.dinner.domain.Order;

/**
 * Order repository.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}