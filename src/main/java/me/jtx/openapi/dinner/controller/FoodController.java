package me.jtx.openapi.dinner.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import me.jtx.openapi.dinner.domain.Food;

/**
 * Order
 * 
 * @author huazhong
 *
 */
@RequestMapping("/food")
@RestController
public class FoodController {

	@ApiOperation(notes = "根据给定的食物ID查询食物详情", value = "查询食物详情food-get", nickname = "getFood", tags = { "食物" })
	@ApiResponses({ @ApiResponse(code = 200, message = "Success", response = Food.class),
			@ApiResponse(code = 400, message = "Invalid food_id supplied", response = me.jtx.openapi.dinner.vo.ApiResponse.class),
			@ApiResponse(code = 404, message = "Food not found", response = me.jtx.openapi.dinner.vo.ApiResponse.class) })
	@RequestMapping(value = "/{food_id}", method = RequestMethod.GET)
	public @ResponseBody Food getFood(
			@ApiParam(value = "食物ID", required = true) @PathVariable("food_id") String foodId) {
		return null;
	}

	@RequestMapping(value = "/batch", method = RequestMethod.GET)
	public @ResponseBody Object getbatchFoodCategory(@PathVariable("food_ids") String food_ids) {
		return null;
	}
}
