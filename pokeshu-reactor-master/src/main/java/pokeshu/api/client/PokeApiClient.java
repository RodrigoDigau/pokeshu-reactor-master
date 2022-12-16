package pokeshu.api.client;

import java.util.List;
import java.util.function.Supplier;

import pokeshu.api.query.PageQuery;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.NamedApiResourceList;
import pokeshu.api.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PokeApiClient {
	
	<T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls);
	<T extends PokeApiResource> Mono<T> getResource(Class<T> cls, String idOrName);
	<T extends PokeApiResource> Mono<NamedApiResourceList<T>> getResource(Class<T> cls, PageQuery query);
	<T extends PokeApiResource> Mono<T> followResource(Supplier<NamedApiResource<T>> resourceSupplier, Class<T> cls);
	<T extends PokeApiResource> Flux<T> followResources(Supplier<List<NamedApiResource<T>>> resourcesSupplier, Class<T> cls);
}
