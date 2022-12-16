package pokeshu.api.resource.encountercondition;

import java.util.List;

import pokeshu.api.resource.Name;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.encounterconditionvalue.EncounterConditionValue;
import pokeshu.api.utils.locale.Localizable;

public class EncounterCondition implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	private List<NamedApiResource<EncounterConditionValue>> values;
	
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
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedApiResource<EncounterConditionValue>> getValues() {
		return values;
	}
	public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
		this.values = values;
	}
	
}
