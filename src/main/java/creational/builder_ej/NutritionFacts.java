package creational.builder_ej;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int sodium;
    private final int fat;
    private final int calories;
    private final int carbohydrate;

    public int getServingSize() {
        return this.servingSize;
    }

    public int getServings() {
        return this.servings;
    }

    public int getSodium() {
        return this.sodium;
    }

    public int getFat() {
        return this.fat;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getCarbohydrate() {
        return this.carbohydrate;
    }

    public String toString() {
        return "NutritionFacts(servingSize=" + this.getServingSize() + ", servings=" + this.getServings() + ", sodium=" + this.getSodium() + ", fat=" + this.getFat() + ", calories=" + this.getCalories() + ", carbohydrate=" + this.getCarbohydrate() + ")";
    }

    public static class Builder {
        //required (필수인자)
        private final int servingSize;
        private final int servings;

        //optional (선택적 인자)
        private int sodium = 0;
        private int fat = 0;
        private int calories = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
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
