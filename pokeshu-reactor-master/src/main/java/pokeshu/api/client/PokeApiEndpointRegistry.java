package pokeshu.api.client;

import pokeshu.api.resource.PokeApiResource;

public interface PokeApiEndpointRegistry {
	
	<T extends PokeApiResource> String getEndpoint(Class<T> resource);
	
}
