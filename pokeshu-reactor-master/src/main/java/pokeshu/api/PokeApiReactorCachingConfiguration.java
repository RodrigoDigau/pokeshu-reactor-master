package pokeshu.api;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import pokeshu.api.cache.CacheFacade;
import pokeshu.api.cache.ReactiveCacheManagerCacheFacade;
import pokeshu.api.client.PokeApiClient;
import pokeshu.api.client.PokeApiEntityFactory;
import pokeshu.api.client.ReactiveCachingPokeApiClient;

@Configuration
@Import(PokeApiReactorBaseConfiguration.class)
public class PokeApiReactorCachingConfiguration {
	public static final String CACHE_FACADE_BEAN = "pokeApiReactorCacheFacade";
	
	@Bean(CACHE_FACADE_BEAN)
	public CacheFacade cacheFacade(CacheManager cacheManager) {
		return new ReactiveCacheManagerCacheFacade(cacheManager);
	}
	
	@Bean
	public PokeApiClient pokeApiClient(PokeApiEntityFactory entityFactory, CacheFacade cacheFacade) {
		return new ReactiveCachingPokeApiClient(entityFactory, cacheFacade);
	}
	
}
