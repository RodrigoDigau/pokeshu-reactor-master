package pokeshu.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pokeshu.api.client.MapEndpointRegistry;
import pokeshu.api.client.PokeApiEndpointRegistry;
import pokeshu.api.resource.ability.Ability;
import pokeshu.api.resource.berry.Berry;
import pokeshu.api.resource.berryfirmness.BerryFirmness;
import pokeshu.api.resource.berryflavor.BerryFlavor;
import pokeshu.api.resource.characteristic.Characteristic;
import pokeshu.api.resource.contesteffect.ContestEffect;
import pokeshu.api.resource.contesttype.ContestType;
import pokeshu.api.resource.egggroup.EggGroup;
import pokeshu.api.resource.encountercondition.EncounterCondition;
import pokeshu.api.resource.encounterconditionvalue.EncounterConditionValue;
import pokeshu.api.resource.encountermethod.EncounterMethod;
import pokeshu.api.resource.evolutionchain.EvolutionChain;
import pokeshu.api.resource.evolutiontrigger.EvolutionTrigger;
import pokeshu.api.resource.gender.Gender;
import pokeshu.api.resource.generation.Generation;
import pokeshu.api.resource.growthrate.GrowthRate;
import pokeshu.api.resource.item.Item;
import pokeshu.api.resource.itemattribute.ItemAttribute;
import pokeshu.api.resource.itemcategory.ItemCategory;
import pokeshu.api.resource.itemflingeffect.ItemFlingEffect;
import pokeshu.api.resource.itempocket.ItemPocket;
import pokeshu.api.resource.language.Language;
import pokeshu.api.resource.location.Location;
import pokeshu.api.resource.locationarea.LocationArea;
import pokeshu.api.resource.machine.Machine;
import pokeshu.api.resource.move.Move;
import pokeshu.api.resource.moveailment.MoveAilment;
import pokeshu.api.resource.movecategory.MoveCategory;
import pokeshu.api.resource.movedamageclass.MoveDamageClass;
import pokeshu.api.resource.movelearnmethod.MoveLearnMethod;
import pokeshu.api.resource.movetarget.MoveTarget;
import pokeshu.api.resource.nature.Nature;
import pokeshu.api.resource.pokedex.Pokedex;
import pokeshu.api.resource.pokemon.Pokemon;
import pokeshu.api.resource.pokemoncolor.PokemonColor;
import pokeshu.api.resource.pokemonform.PokemonForm;
import pokeshu.api.resource.pokemonhabitat.PokemonHabitat;
import pokeshu.api.resource.pokemonshape.PokemonShape;
import pokeshu.api.resource.pokemonspecies.PokemonSpecies;
import pokeshu.api.resource.region.Region;
import pokeshu.api.resource.stat.Stat;
import pokeshu.api.resource.supercontesteffect.SuperContestEffect;
import pokeshu.api.resource.type.Type;
import pokeshu.api.resource.version.Version;
import pokeshu.api.resource.versiongroup.VersionGroup;

@Configuration
public class PokeApiReactorEndpointConfiguration {

	@Bean
	public PokeApiEndpointRegistry endpointRegistry() {
		Map<Class<?>, String> endpoints = new HashMap<>();
		endpoints.put(Ability.class, "ability");
		endpoints.put(Berry.class, "berry");
		endpoints.put(BerryFirmness.class, "berry-firmness");
		endpoints.put(BerryFlavor.class, "berry-flavor");
		endpoints.put(Characteristic.class, "characteristic");
		endpoints.put(ContestEffect.class, "contest-effect");
		endpoints.put(ContestType.class, "contest-type");
		endpoints.put(EggGroup.class, "egg-group");
		endpoints.put(EncounterCondition.class, "encounter-condition");
		endpoints.put(EncounterConditionValue.class, "encounter-condition-value");
		endpoints.put(EncounterMethod.class, "encounter-method");
		endpoints.put(EvolutionChain.class, "evolution-chain");
		endpoints.put(EvolutionTrigger.class, "evolution-trigger");
		endpoints.put(Gender.class, "gender");
		endpoints.put(Generation.class, "generation");
		endpoints.put(GrowthRate.class, "growth-rate");
		endpoints.put(Item.class, "item");
		endpoints.put(ItemAttribute.class, "item-attribute");
		endpoints.put(ItemCategory.class, "item-category");
		endpoints.put(ItemFlingEffect.class, "item-fling-effect");
		endpoints.put(ItemPocket.class, "item-pocket");
		endpoints.put(Language.class, "language");
		endpoints.put(Location.class, "location");
		endpoints.put(LocationArea.class, "location-area");
		endpoints.put(Machine.class, "machine");
		endpoints.put(Move.class, "move");
		endpoints.put(MoveAilment.class, "move-ailment");
		endpoints.put(MoveCategory.class, "move-category");
		endpoints.put(MoveDamageClass.class, "move-damage-class");
		endpoints.put(MoveLearnMethod.class, "move-learn-method");
		endpoints.put(MoveTarget.class, "move-target");
		endpoints.put(Nature.class, "nature");
		endpoints.put(Pokedex.class, "pokdex");
		endpoints.put(Pokemon.class, "pokemon");
		endpoints.put(PokemonColor.class, "pokemon-color");
		endpoints.put(PokemonForm.class, "pokemon-form");
		endpoints.put(PokemonHabitat.class, "pokemon-habitat");
		endpoints.put(PokemonShape.class, "pokemon-shape");
		endpoints.put(PokemonSpecies.class, "pokemon-species");
		endpoints.put(Region.class, "pokemon-region");
		endpoints.put(Stat.class, "stat");
		endpoints.put(SuperContestEffect.class, "super-contest-effect");
		endpoints.put(Type.class, "type");
		endpoints.put(Version.class, "version");
		endpoints.put(VersionGroup.class, "version-group");
		
		return new MapEndpointRegistry(endpoints);
	}
	
}
