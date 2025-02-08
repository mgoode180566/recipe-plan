package dev.goode.recipe_plan.recipe.search;

import dev.goode.recipe_plan.recipe.search.service.RecipeService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
public class RecipeSearchController {
	
	RecipeService recipeService;
	public RecipeSearchController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}
	@GetMapping("/search")
	public Mono<String> getRecipes(@RequestParam String query) {
		return recipeService.search(query);
	}
	@GetMapping("/hello")
	public String getMessage() { return "Hello......................";}
}
