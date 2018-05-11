package me.jtx.openapi.dinner.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Order
 * 
 * @author huazhong
 *
 */
@RequestMapping("/restaurant")
@RestController
public class RestaurantController {

	
	@RequestMapping(value = "/{restaurant_id}/food_categories", method = RequestMethod.GET)
	public @ResponseBody Object getRestaurantFoodCagegoryList(@PathVariable("restaurant_id") String restaurantId) {
		return null;
	}
}
