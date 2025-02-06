package dev.goode.recipe_plan.recipe.search.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
	
	@Value("${recipeservice.base.url}")
	private String recipeBaseUrl;
	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return WebClient.builder().baseUrl(recipeBaseUrl).build();
	}
}

