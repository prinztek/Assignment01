
public class Hero {
	
	// Private Properties ********************************************
	private int strength;
	private int speed;
	private int health;
	
	// Private Properties ********************************************
	public String name;
	
	// CONSTRUCTOR *******************************************
	public Hero(String name) {
		this.name = name;
		generateAbilities();
	}
	
	// PRIVATE METHODS *******************************************
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
}
