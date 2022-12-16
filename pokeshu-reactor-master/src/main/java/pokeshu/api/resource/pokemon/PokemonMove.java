package pokeshu.api.resource.pokemon;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.move.Move;

public class PokemonMove {

	private NamedApiResource<Move> move;
	private List<PokemonMoveVersion> versionGroupDetails;
	
	public NamedApiResource<Move> getMove() {
		return move;
	}
	public void setMove(NamedApiResource<Move> move) {
		this.move = move;
	}
	public List<PokemonMoveVersion> getVersionGroupDetails() {
		return versionGroupDetails;
	}
	public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
		this.versionGroupDetails = versionGroupDetails;
	}
	
}
