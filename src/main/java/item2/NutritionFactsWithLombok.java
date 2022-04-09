package item2;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;

import java.beans.ConstructorProperties;

@Builder
@Getter
public class NutritionFactsWithLombok {
    @NonNull
    private final Integer servingSize;

    @NonNull
    private final Integer servings;

    @Builder.Default
    private int calories = 0;

    @Builder.Default
    private int fat = 0;

    @Builder.Default
    private int sodium = 0;

    @Builder.Default
    private int carbohydrate = 0;

    public static NutritionFactsWithLombokBuilder builder(int servingSize, int servings) {
        return new NutritionFactsWithLombokBuilder()
                .servingSize(servingSize)
                .servings(servings);
    }
}
