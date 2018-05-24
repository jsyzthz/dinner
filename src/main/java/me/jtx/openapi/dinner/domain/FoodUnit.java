package me.jtx.openapi.dinner.domain;

import java.util.Objects;

import lombok.Getter;

/**
 * Food Unit
 * 
 * @author huazhong
 * @date 2018/05/17
 */
@Getter
public enum FoodUnit {
    /**
     * 包
     */
    PKT(1010, "food.unit.packet"),
    /**
     * 件，片等
     */
    PCS(1020, "food.unit.piece"),
    /**
     * 袋
     */
    BAG(1030, "food.unit.bag"),
    /**
     * 灌
     */
    TIN(1040, "food.unit.tin"),
    /**
     *  扎，捆
     */
    BUNDLE(1050, "food.unit.bundle"),
    
    /**
     * 一打(12个)
     */
    DZ(1060, "food.unit.dozen"),
    /**
     * 瓶
     */
    BOT(1070, "food.unit.bottle"),
    /**
     * 桶
     */
    TUBS(1080, "food.unit.tubs"),
    /**
     * 升
     */
    LITER(1090, "food.unit.liter"),

    /**
     * 斤
     */
    JIN(1100, "food.unit.jin"),
    /**
     * 克
     */
    GR(1110, "food.unit.gram"),

    /**
     * 千克
     */
    KG(1120, "food.unit.kilogram");

    private int code;

    private String name;

    private FoodUnit(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public static FoodUnit fromCode(Integer code) {
        for (FoodUnit foodSpec : FoodUnit.values()) {
            if (Objects.equals(code, foodSpec.getCode())) {
                return foodSpec;
            }
        }
        throw new IllegalArgumentException();
    }

}
