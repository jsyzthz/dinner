package me.jtx.openapi.dinner.service;

import java.util.List;
import java.util.Map;

import me.jtx.openapi.dinner.domain.Food;

/**
 * Food service interface.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
public interface IFoodService {

    Long save(Food newFood);

    Map<String, Long> save(List<Food> newFoods);

    Food findById(long id);

    List<Food> findByIds(List<Long> ids);

    List<Food> findFoodsByCategoryId(long categoryId);
}
