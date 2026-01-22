package com.example.meal.service;

import com.example.meal.model.Meal;
import com.example.meal.model.MealResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

@Service
public class MealService {

    private static final String API_URL =
            "https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata";

    public Meal getMealWithLeastIngredients() {

        RestTemplate restTemplate = new RestTemplate();

        MealResponse response =
                restTemplate.getForObject(API_URL, MealResponse.class);

        // 🔍 DEBUG LOGS
        if (response == null) {
            System.out.println("❌ RESPONSE IS NULL");
            return null;
        }

        List<Meal> meals = response.getMeals();

        if (meals == null || meals.isEmpty()) {
            System.out.println("❌ MEALS LIST IS NULL OR EMPTY");
            return null;
        }

        System.out.println("✅ TOTAL MEALS RECEIVED: " + meals.size());

        Meal result = meals.stream()
                .min(Comparator.comparingInt(this::countIngredients))
                .orElse(null);

        if (result != null) {
            System.out.println("✅ SELECTED MEAL: " + result.getStrMeal());
            System.out.println("✅ INGREDIENT COUNT: " + countIngredients(result));
        }

        return result;
    }

    private int countIngredients(Meal meal) {
        int count = 0;

        for (Field field : meal.getClass().getDeclaredFields()) {
            if (field.getName().startsWith("strIngredient")) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(meal);

                    if (value != null && !value.toString().trim().isEmpty()) {
                        count++;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return count;
    }
}
