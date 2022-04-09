package item2;

import lombok.NoArgsConstructor;
import lombok.Value;

@Value
public class NutritionFacts {
    int servingSize;
    int servings;
    int calories;
    int fat;
    int sodium;
    int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        // optional
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder withCalories(int val) {
            calories = val;
            return this;
        }

        public Builder withFat(int val) {
            fat = val;
            return this;
        }

        public Builder withSodium(int val) {
            sodium = val;
            return this;
        }

        public Builder withCarbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
