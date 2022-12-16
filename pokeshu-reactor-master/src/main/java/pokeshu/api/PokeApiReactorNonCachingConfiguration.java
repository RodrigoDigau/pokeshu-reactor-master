package pokeshu.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import pokeshu.api.client.PokeApiClient;
import pokeshu.api.client.PokeApiEntityFactory;
import pokeshu.api.client.ReactiveNonCachingPokeApiClient;

@Configuration
@Import(PokeApiReactorBaseConfiguration.class)
public class PokeApiReactorNonCachingConfiguration {

	@Bean
	public PokeApiClient pokeApiClient(PokeApiEntityFactory entityFactory) {
		return new ReactiveNonCachingPokeApiClient(entityFactory);
	}
	
}
