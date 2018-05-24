package me.jtx.openapi.dinner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.jtx.openapi.dinner.domain.Food;

/**
 * Food repository.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByFoodCategoryId(long categoryId);

}
