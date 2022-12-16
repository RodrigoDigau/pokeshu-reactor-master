package pokeshu.api.client;

import java.util.Collections;
import java.util.Map;

import pokeshu.api.resource.PokeApiResource;

public class MapEndpointRegistry implements PokeApiEndpointRegistry {

	private Map<Class<?>, String> endpoints;

	public MapEndpointRegistry(Map<Class<?>, String> endpoints) {
		this.endpoints = Collections.unmodifiableMap(endpoints);
	}

	@Override
	public <T extends PokeApiResource> String getEndpoint(Class<T> resource) {
		return endpoints.get(resource);
	}

}
