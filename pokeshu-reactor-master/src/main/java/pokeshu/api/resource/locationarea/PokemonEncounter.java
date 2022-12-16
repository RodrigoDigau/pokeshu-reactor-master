package pokeshu.api.resource.locationarea;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.VersionEncounterDetail;
import pokeshu.api.resource.pokemon.Pokemon;

public class PokemonEncounter {

	private NamedApiResource<Pokemon> pokemon;
	private List<VersionEncounterDetail> versionDetails;
	
	public NamedApiResource<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedApiResource<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
