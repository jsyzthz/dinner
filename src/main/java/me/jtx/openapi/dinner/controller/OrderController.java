package me.jtx.openapi.dinner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import me.jtx.openapi.dinner.service.ISMSService;

/**
 * Order
 * 
 * @author huazhong
 *
 */
@RequestMapping("/order")
@RestController
public class OrderController {
	@Autowired
	private ISMSService smsService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public @ResponseBody Object addOrder(@PathVariable("supplierId") String supplierId) {
		return null;
	}

	@RequestMapping(value = "/{order_id}", method = RequestMethod.GET)
	public @ResponseBody Object getOrder(@PathVariable("order_id") String orderId) {
		//test
		smsService.sentSingleMessage("86", "orderId", "What are you doing!");
		return null;
	}

	@RequestMapping(value = "/{order_id}/status", method = RequestMethod.GET)
	public @ResponseBody Object getOrderStatus(@PathVariable("order_id") String orderId) {
		return null;
	}

	@RequestMapping(value = "/{order_id}/status", method = RequestMethod.PUT)
	public @ResponseBody Object updateOrderStatus(@PathVariable("order_id") String orderId) {
		return null;
	}
}
