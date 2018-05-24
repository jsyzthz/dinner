package me.jtx.openapi.dinner.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Food category controller.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@RequestMapping("/food_category")
@RestController
public class FoodCategoryController {

    @RequestMapping(value = "/{food_category_id}", method = RequestMethod.GET)
    public @ResponseBody Object getFoodCategory(@PathVariable("food_category_id") String foodCategoryId) {
        return null;
    }

    @RequestMapping(value = "/{food_category_id}/foods", method = RequestMethod.GET)
    public @ResponseBody Object getFoodList(@PathVariable("food_category_id") String foodCategoryId) {
        return null;
    }
}
