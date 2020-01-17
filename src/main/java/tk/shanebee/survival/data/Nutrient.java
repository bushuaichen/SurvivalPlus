package tk.shanebee.survival.data;

/**
 * Player nutrient types
 */
public enum Nutrient {

	CARBS("Carbs"),
	PROTEIN("Protein"),
	SALTS("Salts");

	private String name;

	Nutrient(String nutrient){
		name = nutrient;
	}

	public String getName() {
		return name;
	}

}