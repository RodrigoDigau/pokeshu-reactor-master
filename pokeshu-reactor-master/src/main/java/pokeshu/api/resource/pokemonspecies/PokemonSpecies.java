package pokeshu.api.resource.pokemonspecies;

import java.util.List;

import pokeshu.api.resource.ApiResource;
import pokeshu.api.resource.Description;
import pokeshu.api.resource.FlavorText;
import pokeshu.api.resource.Name;
import pokeshu.api.resource.NamedApiResource;
import pokeshu.api.resource.PokeApiResource;
import pokeshu.api.resource.egggroup.EggGroup;
import pokeshu.api.resource.evolutionchain.EvolutionChain;
import pokeshu.api.resource.generation.Generation;
import pokeshu.api.resource.growthrate.GrowthRate;
import pokeshu.api.resource.pokemoncolor.PokemonColor;
import pokeshu.api.resource.pokemonhabitat.PokemonHabitat;
import pokeshu.api.resource.pokemonshape.PokemonShape;
import pokeshu.api.utils.locale.Localizable;

public class PokemonSpecies implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private Integer order;
	private Integer genderRate;
	private Integer captureRate;
	private Integer baseHappiness;
	private Boolean isBaby;
	private Boolean isLegendary;
	private Boolean isMythical;
	private Integer hatchCounter;
	private Boolean hasGenderDifferences;
	private Boolean formsSwitchable;
	private NamedApiResource<GrowthRate> growthRate;
	private List<PokemonSpeciesDexEntry> pokedexNumbers;
	private List<NamedApiResource<EggGroup>> eggGroups;
	private NamedApiResource<PokemonColor> color;
	private NamedApiResource<PokemonShape> shape;
	private NamedApiResource<PokemonSpecies> evolvesFromSpecies;
	private ApiResource<EvolutionChain> evolutionChain;
	private NamedApiResource<PokemonHabitat> habitat;
	private NamedApiResource<Generation> generation;
	private List<Name> names;
	private List<FlavorText> flavorTextEntries;
	private List<Description> formDescriptions;
	private List<Genus> genera;
	private List<PokemonSpeciesVariety> varieties;
	
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getGenderRate() {
		return genderRate;
	}
	public void setGenderRate(Integer genderRate) {
		this.genderRate = genderRate;
	}
	public Integer getCaptureRate() {
		return captureRate;
	}
	public void setCaptureRate(Integer captureRate) {
		this.captureRate = captureRate;
	}
	public Integer getBaseHappiness() {
		return baseHappiness;
	}
	public void setBaseHappiness(Integer baseHappiness) {
		this.baseHappiness = baseHappiness;
	}
	public Boolean getIsBaby() {
		return isBaby;
	}
	public void setIsBaby(Boolean isBaby) {
		this.isBaby = isBaby;
	}
	public Boolean getIsLegendary() {
		return isLegendary;
	}
	public void setIsLegendary(Boolean isLegendary) {
		this.isLegendary = isLegendary;
	}
	public Boolean getIsMythical() {
		return isMythical;
	}
	public void setIsMythical(Boolean isMythical) {
		this.isMythical = isMythical;
	}
	public Integer getHatchCounter() {
		return hatchCounter;
	}
	public void setHatchCounter(Integer hatchCounter) {
		this.hatchCounter = hatchCounter;
	}
	public Boolean getHasGenderDifferences() {
		return hasGenderDifferences;
	}
	public void setHasGenderDifferences(Boolean hasGenderDifferences) {
		this.hasGenderDifferences = hasGenderDifferences;
	}
	public Boolean getFormsSwitchable() {
		return formsSwitchable;
	}
	public void setFormsSwitchable(Boolean formsSwitchable) {
		this.formsSwitchable = formsSwitchable;
	}
	public NamedApiResource<GrowthRate> getGrowthRate() {
		return growthRate;
	}
	public void setGrowthRate(NamedApiResource<GrowthRate> growthRate) {
		this.growthRate = growthRate;
	}
	public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
		return pokedexNumbers;
	}
	public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
		this.pokedexNumbers = pokedexNumbers;
	}
	public List<NamedApiResource<EggGroup>> getEggGroups() {
		return eggGroups;
	}
	public void setEggGroups(List<NamedApiResource<EggGroup>> eggGroups) {
		this.eggGroups = eggGroups;
	}
	public NamedApiResource<PokemonColor> getColor() {
		return color;
	}
	public void setColor(NamedApiResource<PokemonColor> color) {
		this.color = color;
	}
	public NamedApiResource<PokemonShape> getShape() {
		return shape;
	}
	public void setShape(NamedApiResource<PokemonShape> shape) {
		this.shape = shape;
	}
	public NamedApiResource<PokemonSpecies> getEvolvesFromSpecies() {
		return evolvesFromSpecies;
	}
	public void setEvolvesFromSpecies(NamedApiResource<PokemonSpecies> evolvesFromSpecies) {
		this.evolvesFromSpecies = evolvesFromSpecies;
	}
	public ApiResource<EvolutionChain> getEvolutionChain() {
		return evolutionChain;
	}
	public void setEvolutionChain(ApiResource<EvolutionChain> evolutionChain) {
		this.evolutionChain = evolutionChain;
	}
	public NamedApiResource<PokemonHabitat> getHabitat() {
		return habitat;
	}
	public void setHabitat(NamedApiResource<PokemonHabitat> habitat) {
		this.habitat = habitat;
	}
	public NamedApiResource<Generation> getGeneration() {
		return generation;
	}
	public void setGeneration(NamedApiResource<Generation> generation) {
		this.generation = generation;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}
	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}
	public List<Description> getFormDescriptions() {
		return formDescriptions;
	}
	public void setFormDescriptions(List<Description> formDescriptions) {
		this.formDescriptions = formDescriptions;
	}
	public List<Genus> getGenera() {
		return genera;
	}
	public void setGenera(List<Genus> genera) {
		this.genera = genera;
	}
	public List<PokemonSpeciesVariety> getVarieties() {
		return varieties;
	}
	public void setVarieties(List<PokemonSpeciesVariety> varieties) {
		this.varieties = varieties;
	}
	
}
