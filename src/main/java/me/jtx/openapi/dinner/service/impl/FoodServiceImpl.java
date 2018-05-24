package me.jtx.openapi.dinner.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.jtx.openapi.dinner.domain.Food;
import me.jtx.openapi.dinner.repository.FoodRepository;
import me.jtx.openapi.dinner.service.IFoodService;

/**
 * Food service.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private FoodRepository foodRespository;

    @Override
    public Long save(Food newFood) {
        Food food = foodRespository.saveAndFlush(newFood);
        if (food != null) {
            return food.getId();
        }
        return null;
    }

    @Override
    public Map<String, Long> save(List<Food> newFoods) {
        Map<String, Long> foods = new HashMap<>();
        if (newFoods == null || newFoods.size() == 0) {
            return foods;
        }
        for (Food newFood : newFoods) {
            Food food = foodRespository.saveAndFlush(newFood);
            if (food != null) {
                foods.put(food.getName(), food.getId());
            }
        }
        return foods;
    }

    @Override
    public Food findById(long id) {
        return foodRespository.findOne(id);
    }

    @Override
    public List<Food> findByIds(List<Long> ids) {
        List<Food> foods = new ArrayList<>();
        if (ids == null || ids.size() == 0) {
            return foods;
        }
        for (long id : ids) {
            Food food = foodRespository.findOne(id);
            if (food != null) {
                foods.add(food);
            }
        }
        return foods;
    }

    @Override
    public List<Food> findFoodsByCategoryId(long categoryId) {
        return foodRespository.findByFoodCategoryId(categoryId);
    }
}
