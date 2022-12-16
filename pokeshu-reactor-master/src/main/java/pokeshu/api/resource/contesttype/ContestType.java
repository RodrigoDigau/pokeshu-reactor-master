package pokeshu.api.resource.contesttype;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.berryflavor.BerryFlavor;

public class ContestType implements PokeApiResource {

	private Integer id;
	private String name;
	private NamedApiResource<BerryFlavor> berryFlavor;
	private List<ContestName> names;
	
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
	public NamedApiResource<BerryFlavor> getBerryFlavor() {
		return berryFlavor;
	}
	public void setBerryFlavor(NamedApiResource<BerryFlavor> berryFlavor) {
		this.berryFlavor = berryFlavor;
	}
	public List<ContestName> getNames() {
		return names;
	}
	public void setNames(List<ContestName> names) {
		this.names = names;
	}
	
}
