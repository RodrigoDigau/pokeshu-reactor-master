package pokeshu.api.resource.pokemonspecies;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.pokemon.Pokemon;

public class PokemonSpeciesVariety {

	private Boolean isDefault;
	private NamedApiResource<Pokemon> pokemon;
	
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
}
