package pokeshu.api.resource.pokemon;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.ability.Ability;

public class PokemonAbility {

	private Boolean isHidden;
	private Integer slot;
	private NamedApiResource<Ability> ability;
	
	public Boolean getIsHidden() {
		return isHidden;
	}
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedApiResource<Ability> getAbility() {
		return ability;
	}
	public void setAbility(NamedApiResource<Ability> ability) {
		this.ability = ability;
	}
	
}
