package dev.goode.recipe_plan.recipe.search;

import dev.goode.recipe_plan.recipe.search.service.IngredientService;
import dev.goode.recipe_plan.recipe.search.service.RecipeService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RecipeSearchController {
	RecipeService recipeService;
	IngredientService ingredientService;
	public RecipeSearchController(RecipeService recipeService, IngredientService ingredientService) {
		this.recipeService = recipeService;
		this.ingredientService = ingredientService;
	}
	@GetMapping("/search")
	public Mono<String> getRecipes(@RequestParam String query) {
		return recipeService.search(query);
	}

	@GetMapping("/ingredients")
	public List<String> getPopularIngredients() {
		return ingredientService.getPopularIngredients();
	}
}
