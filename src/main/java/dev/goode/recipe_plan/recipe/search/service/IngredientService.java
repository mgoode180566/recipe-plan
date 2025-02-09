package dev.goode.recipe_plan.recipe.search.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IngredientService {
	
	public List<String> getPopularIngredients() {
		return Arrays.asList("ham", "eggs", "cheese", "bacon", "caviar", "oysters", "beef", "baked beans", "stilton cheese", "lard");
	}
	
	
	
}
