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
@RequestMapping("/food")
@RestController
public class FoodController {

	@RequestMapping(value = "/food_id", method = RequestMethod.GET)
	public @ResponseBody Object getFoodCategory(@PathVariable("food_id") String foodId) {
		return null;
	}

	@RequestMapping(value = "/batch", method = RequestMethod.GET)
	public @ResponseBody Object getbatchFoodCategory(@PathVariable("food_ids") String food_ids) {
		return null;
	}
}
