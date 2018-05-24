package me.jtx.openapi.dinner.service;

import me.jtx.openapi.dinner.domain.FoodCategory;

/**
 * Food category service interface.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
public interface IFoodCategoryService {

    FoodCategory findById(long id);

}
