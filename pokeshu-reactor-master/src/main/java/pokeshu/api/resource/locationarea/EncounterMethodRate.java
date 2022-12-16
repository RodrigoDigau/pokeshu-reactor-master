package pokeshu.api.resource.locationarea;

import java.util.List;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.encountermethod.EncounterMethod;

public class EncounterMethodRate {

	private NamedApiResource<EncounterMethod> encounterMethod;
	private List<EncounterVersionDetails> versionDetails;
	
	public NamedApiResource<EncounterMethod> getEncounterMethod() {
		return encounterMethod;
	}
	public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
		this.encounterMethod = encounterMethod;
	}
	public List<EncounterVersionDetails> getVersionDetails() {
		return versionDetails;
	}
	public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}
	
}
