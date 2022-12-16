package pokeshu.api.resource.item;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.version.Version;

public class ItemHolderPokemonVersionDetail {

	private Integer rarity;
	private NamedApiResource<Version> version;
	
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
	public NamedApiResource<Version> getVersion() {
		return version;
	}
	public void setVersion(NamedApiResource<Version> version) {
		this.version = version;
	}
	
}
