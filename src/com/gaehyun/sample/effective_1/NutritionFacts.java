package com.gaehyun.sample.effective_1;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrates;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private  int calories = 0;
        private  int fat = 0;
        private  int sodium = 0;
        private  int carbohydrates = 0;

        public Builder(int servingSize , int servings){
            this.servingSize = servingSize;
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

        public Builder carbohydrates(int val){
            carbohydrates = val; return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }


    }

    public NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        fat = builder.fat;
        calories = builder.calories;
        sodium = builder.sodium;
        carbohydrates = builder.carbohydrates;
    }

}
