
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
	
	private boolean hitAttempt() {
		int randomNumber = (int)(Math.random() * 5 + 1);
		if (randomNumber == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	private int hitDamage() {
		int damage = (int)(Math.random() * 6 + 1) * this.strength;
		return damage;
	}
	
	// PUBLIC METHODS *******************************************
	public boolean fight() {
		System.out.println("The " + this.name + " is fighting!");
		// call hitAttempt()
		// if hitAttempt() returns true
		// call hitDamage()
		return true;
	}
	
	public void show() {
		System.out.println("--------------------------------");
		System.out.println("strength: " + this.strength);
		System.out.println("speed: " + this.speed);
		System.out.println("health: " + this.health);
		System.out.println("--------------------------------");
	}
}
