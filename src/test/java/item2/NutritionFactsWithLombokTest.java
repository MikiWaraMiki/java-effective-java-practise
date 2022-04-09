package item2;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutritionFactsWithLombokTest {
    @Test
    public void testBuilderOnlyRequiredArgs() {
        val servingSize = 100;
        val servings = 10;

        val nutritionFacts = NutritionFactsWithLombok.builder(servingSize, servings)
                .build();

        assertEquals(servingSize, nutritionFacts.getServingSize());
        assertEquals(servings, nutritionFacts.getServings());
        assertEquals(0, nutritionFacts.getCalories());
        assertEquals(0, nutritionFacts.getFat());
        assertEquals(0,nutritionFacts.getSodium());
        assertEquals(0, nutritionFacts.getCarbohydrate());
    }

    @Test
    public void testBuilderWithCalories() {
        val servingSize = 100;
        val servings = 10;
        val calories = 0;

        val nutritionFacts = NutritionFactsWithLombok.builder(servingSize, servings)
                .calories(calories)
                .build();

        assertEquals(servingSize, nutritionFacts.getServingSize());
        assertEquals(servings, nutritionFacts.getServings());
        assertEquals(calories, nutritionFacts.getCalories());
    }

    @Test
    public void testBuilderWithFat() {
        val servingSize = 100;
        val servings = 10;
        val fat = 10;

        val nutritionFacts = NutritionFactsWithLombok.builder(servingSize, servings)
                .fat(fat)
                .build();

        assertEquals(servingSize, nutritionFacts.getServingSize());
        assertEquals(servings, nutritionFacts.getServings());
        assertEquals(fat, nutritionFacts.getFat());
    }

    @Test
    public void testBuilderWithSodium() {
        val servingSize = 100;
        val servings = 10;
        val sodium = 10;

        val nutritionFacts = NutritionFactsWithLombok.builder(servingSize, servings)
                .sodium(sodium)
                .build();

        assertEquals(servingSize, nutritionFacts.getServingSize());
        assertEquals(servings, nutritionFacts.getServings());
        assertEquals(sodium, nutritionFacts.getSodium());
    }

    @Test
    public void testBuilderWithCarbohydrate() {
        val servingSize = 100;
        val servings = 10;
        val carbohydrate = 10;

        val nutritionFacts = NutritionFactsWithLombok.builder(servingSize, servings)
                .carbohydrate(carbohydrate)
                .build();

        assertEquals(servingSize, nutritionFacts.getServingSize());
        assertEquals(servings, nutritionFacts.getServings());
        assertEquals(carbohydrate, nutritionFacts.getCarbohydrate());

    }

}