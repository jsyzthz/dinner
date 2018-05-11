package me.jtx.openapi.dinner.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.jtx.openapi.dinner.domain.Order;
import me.jtx.openapi.dinner.domain.OrderItem;
import me.jtx.openapi.dinner.repository.OrderItemRepository;
import me.jtx.openapi.dinner.repository.OrderRepository;

@Service
public class DemoService {

	@Resource
	private OrderRepository orderRepository;

	@Resource
	private OrderItemRepository orderItemRepository;

	public void demo() {
		List<Long> orderIds = new ArrayList<>(10);
		List<Long> orderItemIds = new ArrayList<>(10);
		System.out.println("1.Insert--------------");
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setUserId(51);
			order.setStatus("INSERT_TEST");
			long orderId = orderRepository.save(order).getId();
			orderIds.add(orderId);
			OrderItem item = new OrderItem();
			item.setOrderId(orderId);
			item.setUserId(51);
			orderItemIds.add(orderItemRepository.save(item).getId());
		}
		List<OrderItem> orderItems = orderItemRepository.findAll();
		System.out.println(orderItemRepository.findAll());
		System.out.println("2.Delete--------------");
		if (orderItems.size() > 0) {
			for (Long each : orderItemIds) {
				orderItemRepository.delete(each);
			}
			for (Long each : orderIds) {
				orderRepository.delete(each);
			}
		}
		System.out.println(orderItemRepository.findAll());
	}
}
