
public class Project {

	public static void main(String[] args) {
		
		// Instantiate Hero
		Hero mark = new Hero("Mark Strong");
		
		// call Hero methods
		mark.show();
		mark.fight();
		
		// Sample output:
		// Mark Strong Abilities
		// --------------------------------
		// strength: 11
		// speed: 21
		// health: 90
		// --------------------------------
		// Total damage: 33
	}

}
