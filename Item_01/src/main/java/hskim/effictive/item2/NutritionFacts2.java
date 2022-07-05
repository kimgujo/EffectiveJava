package hskim.effictive.item2;

public class NutritionFacts2 {

    // 매개변수들은 (기본값이 있다면) 기본값으로 초기화 된다.
    // final을 쓰면 setter을 사용할 수 없음으로 불변을 정의할 수 없음.
    private int serviceSize   = -1;      // 필수
    private int servings      = -1;      // 필수
    private int calories      = 0;       // 선택
    private int fat           = 0;       // 선택
    private int sodium        = 0;       // 선택
    private int carbohydratez = 0;       // 선택

    public NutritionFacts2() {}

    public int getServiceSize() {
        return serviceSize;
    }

    public void setServiceSize(int serviceSize) {
        this.serviceSize = serviceSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydratez() {
        return carbohydratez;
    }

    public void setCarbohydratez(int carbohydratez) {
        this.carbohydratez = carbohydratez;
    }
}
