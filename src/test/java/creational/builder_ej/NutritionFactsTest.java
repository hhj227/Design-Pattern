package creational.builder_ej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutritionFactsTest {
    @Test
    void test(){
        NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
        builder.calories(100);
        builder.sodium(35);
        builder.carbohydrate(27);
        NutritionFacts cocaCola1 = builder.build();

        NutritionFacts cocaCola2 = new NutritionFacts
                .Builder(240, 8)    // 필수값 입력
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(cocaCola1.toString());
    }
}