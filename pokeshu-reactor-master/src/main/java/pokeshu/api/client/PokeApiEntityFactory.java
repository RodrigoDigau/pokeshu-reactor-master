package pokeshu.api.client;

import java.util.List;

import pokeshu.api.query.PageQuery;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.NamedApiResourceList;
import pokeshu.api.resource.PokeApiResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PokeApiEntityFactory {

	<T extends PokeApiResource> Mono<T> getResource(Class<T> resourceClass, String nameOrId);
	<T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass);
	<T extends PokeApiResource> Mono<NamedApiResourceList<T>> getBaseResource(Class<T> resourceClass, PageQuery query);
	<T extends PokeApiResource> Mono<T> getNamedResource(NamedApiResource<T> resource, Class<T> resourceClass);
	<T extends PokeApiResource> Flux<T> getNamedResources(List<NamedApiResource<T>> resources, Class<T> resourceClass);
	
}
