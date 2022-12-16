package pokeshu.api.resource.berry;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.berryflavor.BerryFlavor;

public class BerryFlavorMap {

	private Integer potency;
	private NamedApiResource<BerryFlavor> flavor;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<BerryFlavor> getFlavor() {
		return flavor;
	}
	public void setFlavor(NamedApiResource<BerryFlavor> flavor) {
		this.flavor = flavor;
	}
	
}
