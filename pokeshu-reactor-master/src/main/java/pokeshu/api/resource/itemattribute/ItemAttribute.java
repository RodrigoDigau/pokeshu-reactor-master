package pokeshu.api.resource.itemattribute;

import java.util.List;

import pokeshu.api.resource.Description;
import pokeshu.api.resource.Name;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.item.Item;
import pokeshu.api.utils.locale.Localizable;

public class ItemAttribute implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Item>> items;
	private List<Name> names;
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
	public List<NamedApiResource<Item>> getItems() {
		return items;
	}
	public void setItems(List<NamedApiResource<Item>> items) {
		this.items = items;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<Description> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	
}
