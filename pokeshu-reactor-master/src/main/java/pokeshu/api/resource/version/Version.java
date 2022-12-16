package pokeshu.api.resource.version;

import java.util.List;

import pokeshu.api.resource.Name;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.versiongroup.VersionGroup;
import pokeshu.api.utils.locale.Localizable;

public class Version implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<Name> names;
	private NamedApiResource<VersionGroup> versionGroup;
	
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
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	
}
