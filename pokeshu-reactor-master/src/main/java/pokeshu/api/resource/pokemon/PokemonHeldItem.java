package pokeshu.api.resource.pokemon;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.item.Item;

public class PokemonHeldItem {

	private NamedApiResource<Item> item;
	private List<PokemonHeldItemVersion> versionDetails;
	
	public NamedApiResource<Item> getItem() {
		return item;
	}
	public void setItem(NamedApiResource<Item> item) {
		this.item = item;
	}
	public List<PokemonHeldItemVersion> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
