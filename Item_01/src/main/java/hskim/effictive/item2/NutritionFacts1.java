package hskim.effictive.item2;

public class NutritionFacts1 {
    private final int serviceSize;      // 필수
    private final int servings;         // 필수
    private final int calories;         // 선택
    private final int fat;              // 선택
    private final int sodium;           // 선택
    private final int carbohydrate;     // 선택

    public NutritionFacts1(int serviceSize, int servings){
        this(serviceSize, servings, 0);
    }

    public NutritionFacts1(int serviceSize, int servings, int calories){
        this(serviceSize, servings, calories, 0);
    }

    public NutritionFacts1(int serviceSize, int servings, int calories, int fat){
        this(serviceSize, servings, calories, fat, 0);
    }

    public NutritionFacts1(int serviceSize, int servings, int calories, int fat, int sodium){
        this(serviceSize, servings, calories, fat, sodium, 0);
    }
    public NutritionFacts1(int serviceSize, int servings, int calories, int fat, int sodium, int carbohydrate){
        this.serviceSize =  serviceSize ;
        this.servings = servings ;
        this.calories = calories ;
        this.fat = fat ;
        this.sodium = sodium ;
        this.carbohydrate = carbohydrate ;
    }
}
