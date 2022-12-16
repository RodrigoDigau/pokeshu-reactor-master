package pokeshu.api.cache;

import java.util.List;

import pokeshu.api.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CacheFacade {

	<T extends PokeApiResource> Mono<T> get(CacheSpec<T> cacheSpec);
	<T extends PokeApiResource> Flux<T> getMany(List<CacheSpec<T>> cacheSpecs);
	
}
