package pokeshu.api.resource.pokemon;

import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.movelearnmethod.MoveLearnMethod;
import pokeshu.api.resource.versiongroup.VersionGroup;

public class PokemonMoveVersion {

	private NamedApiResource<MoveLearnMethod> moveLearnMethod;
	private NamedApiResource<VersionGroup> versionGroup;
	private Integer levelLearnedAt;
	
	public NamedApiResource<MoveLearnMethod> getMoveLearnMethod() {
		return moveLearnMethod;
	}
	public void setMoveLearnMethod(NamedApiResource<MoveLearnMethod> moveLearnMethod) {
		this.moveLearnMethod = moveLearnMethod;
	}
	public NamedApiResource<VersionGroup> getVersionGroup() {
		return versionGroup;
	}
	public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
		this.versionGroup = versionGroup;
	}
	public Integer getLevelLearnedAt() {
		return levelLearnedAt;
	}
	public void setLevelLearnedAt(Integer levelLearnedAt) {
		this.levelLearnedAt = levelLearnedAt;
	}
	
}
