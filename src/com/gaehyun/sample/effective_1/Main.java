package com.gaehyun.sample.effective_1;

public class Main {
    public static void main(String[] args) {
        NutritionFacts cocacola = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrates(27).build();

    }
}
