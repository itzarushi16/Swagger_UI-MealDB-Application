package com.example.meal.controller;

import com.example.meal.model.Meal;
import com.example.meal.service.MealService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    private final MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/least-ingredients")
    public Meal getMealWithLeastIngredients() {
        return mealService.getMealWithLeastIngredients();
    }
}
