package hskim.effictive.item2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NutritionFactsTest {

    @Test
    @DisplayName("코드 2-1 점층적 생성자 패턴")
    void test2_1(){
        NutritionFacts1 cocaCola = new NutritionFacts1(240, 8, 100, 0 ,35, 27);
        assertNotNull(cocaCola);

    }

    @Test
    @DisplayName("코드 2-2 자바 빈즈 패턴")
    void test2_2(){
        NutritionFacts2 cocaCola = new NutritionFacts2();
        cocaCola.setServiceSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setFat(0);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydratez(27);
        assertNotNull(cocaCola);
    }

    @Test
    @DisplayName("코드 2-3 빌더 패턴")
    void test2_3(){
        NutritionFacts3 cocaCola = new NutritionFacts3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
    }
}
