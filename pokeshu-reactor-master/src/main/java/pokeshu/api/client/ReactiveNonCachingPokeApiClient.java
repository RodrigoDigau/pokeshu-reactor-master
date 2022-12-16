package pokeshu.api.client;

import java.util.List;
import java.util.function.Supplier;

import pokeshu.api.query.PageQuery;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.NamedApiResourceList;
import pokeshu.api.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveNonCachingPokeApiClient implements PokeApiClient {

	private PokeApiEntityFactory entityFactory;
	
	public ReactiveNonCachingPokeApiClient(PokeApiEntityFactory entityFactory) {
		this.entityFactory = entityFactory;
	}

	@Override
	public <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls) {
		return entityFactory.getBaseResource(cls);
	}

	@Override
	public <T extends PokeApiResource> Mono<T> getResource(Class<T> cls, String idOrName) {
		return entityFactory.getResource(cls, idOrName);
	}

	@Override
	public <T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls, PageQuery query) {
		return entityFactory.getBaseResource(cls, query);
	}

	@Override
	public <T extends PokeApiResource> Mono<T> followResource(Supplier<NamedApiResource<T>> resourceSupplier, Class<T> cls) {
		return Mono.fromSupplier(resourceSupplier)
				.flatMap(resource -> entityFactory.getNamedResource(resource, cls));
	}

	@Override
	public <T extends PokeApiResource> Flux<T> followResources(Supplier<List<NamedApiResource<T>>> resourcesSupplier, Class<T> cls) {
		return Mono.fromSupplier(resourcesSupplier)
				.flatMapMany(resources -> entityFactory.getNamedResources(resources, cls));
	}

}
