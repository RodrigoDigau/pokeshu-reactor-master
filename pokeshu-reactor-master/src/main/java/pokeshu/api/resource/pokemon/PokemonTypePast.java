package pokeshu.api.resource.pokemon;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.generation.Generation;

public class PokemonTypePast {

    private NamedApiResource<Generation> generation;
    private List<PokemonType> types;
    
    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }
    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }
    public List<PokemonType> getTypes() {
        return types;
    }
    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }
}
