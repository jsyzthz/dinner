package me.jtx.openapi.dinner.domain.converter;

import javax.persistence.AttributeConverter;

import me.jtx.openapi.dinner.domain.FoodUnit;

/**
 * Food specific converter.
 * 
 * @author huazhong
 * @date 2018/05/17
 */
public class FoodSpecConverter implements AttributeConverter<FoodUnit, Integer> {

    @Override
    public Integer convertToDatabaseColumn(FoodUnit foodSpec) {
        return foodSpec.getCode();
    }

    @Override
    public FoodUnit convertToEntityAttribute(Integer code) {
        return FoodUnit.fromCode(code);
    }

}
