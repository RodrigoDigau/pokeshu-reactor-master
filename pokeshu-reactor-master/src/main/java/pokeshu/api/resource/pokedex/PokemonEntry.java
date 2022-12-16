package pokeshu.api.resource.pokedex;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.pokemonspecies.PokemonSpecies;

public class PokemonEntry {

	private Integer entryNumber;
	private NamedApiResource<PokemonSpecies> pokemonSpecies;
	
	public Integer getEntryNumber() {
		return entryNumber;
	}
	public void setEntryNumber(Integer entryNumber) {
		this.entryNumber = entryNumber;
	}
	public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
		return pokemonSpecies;
	}
	public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}
	
}
