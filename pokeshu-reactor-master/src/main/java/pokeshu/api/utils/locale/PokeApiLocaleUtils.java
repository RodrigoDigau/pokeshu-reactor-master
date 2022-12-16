package pokeshu.api.utils.locale;

import java.util.Optional;

import pokeshu.api.resource.Name;

public class PokeApiLocaleUtils {

	public static Optional<Name> getInLocale(Localizable localizable, String locale) {
		return localizable.getNames().stream()
				.filter(name -> name.getLanguage().getName().equalsIgnoreCase(locale))
				.findFirst();
	}
	
}
