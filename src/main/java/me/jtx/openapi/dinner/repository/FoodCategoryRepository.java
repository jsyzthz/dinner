package me.jtx.openapi.dinner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.jtx.openapi.dinner.domain.Food;

/**
 * Food category repository.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Repository
public interface FoodCategoryRepository extends JpaRepository<Food, Long> {

}
