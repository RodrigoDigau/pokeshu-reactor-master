package pokeshu.api.resource.movecategory;

import java.util.List;

import pokeshu.api.resource.Description;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.move.Move;

public class MoveCategory implements PokeApiResource {

	private Integer id;
	private String name;
	private List<NamedApiResource<Move>> moves;
	private List<Description> descriptions;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	
}
