package pokeshu.api.resource.berryflavor;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.berry.Berry;

public class FlavorBerryMap {

	private Integer potency;
	private NamedApiResource<Berry> berry;
	
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public NamedApiResource<Berry> getBerry() {
		return berry;
	}
	public void setBerry(NamedApiResource<Berry> berry) {
		this.berry = berry;
	}
	
}
