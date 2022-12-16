package pokeshu.api.resource.pokemon;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.type.Type;

public class PokemonType {

	private Integer slot;
	private NamedApiResource<Type> type;
	
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedApiResource<Type> getType() {
		return type;
	}
	public void setType(NamedApiResource<Type> type) {
		this.type = type;
	}
	
}
