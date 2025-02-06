package dev.goode.recipe_plan.recipe.search.service;

import dev.goode.recipe_plan.recipe.search.config.WebClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RecipeService {
	private static final Logger logger = LoggerFactory.getLogger(RecipeService.class);
	WebClient webClient;
	public RecipeService(WebClient webClient) {
		this.webClient = webClient;
	}
	public Mono<String> search(String query) {
		logger.info(query);
		Mono<String> response = webClient.get().uri(String.format("/search?q=%s&app_id=f1457677&app_key=542fccae7cf8312a1af507b7c8b3969c",query))
											.retrieve()
											.bodyToMono(String.class);
		
		return response;
	}
}
