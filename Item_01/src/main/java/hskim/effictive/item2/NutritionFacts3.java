package hskim.effictive.item2;

public class NutritionFacts3 {
    private final int serviceSize;      // 필수
    private final int servings;         // 필수
    private final int calories;         // 선택
    private final int fat;              // 선택
    private final int sodium;           // 선택
    private final int carbohydrate;     // 선택

    public static class Builder {
        // 필수 매개변수
        private final int serviceSize;      // 필수
        private final int servings;         // 필수

        // 선택 매개변수 - 기본값 초기화
        private int calories      = 0;       // 선택
        private int fat           = 0;       // 선택
        private int sodium        = 0;       // 선택
        private int carbohydrate = 0;       // 선택

        public Builder(int serviceSize, int servings) {
            this.serviceSize = serviceSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val; return this;
        }

        public Builder fat(int val){
            fat = val; return this;
        }

        public Builder sodium(int val){
            sodium = val; return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }

        public NutritionFacts3 build(){
            return new NutritionFacts3(this);
        }
    }

    private NutritionFacts3(Builder builder) {
        this.serviceSize = builder.serviceSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.servings = builder.servings;
        this.carbohydrate = builder.carbohydrate;
        this.sodium = builder.sodium;
    }
}
