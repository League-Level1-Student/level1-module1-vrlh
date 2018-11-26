package extra;

public class Duck {
	int numberOfAnimalsEaten;
	String favoriteAnimalToEat;
	
	Duck(String favoriteAnimalToEat, int numberOfAnimalsEaten) {
      	this.favoriteAnimalToEat = favoriteAnimalToEat;
      	this.numberOfAnimalsEaten = numberOfAnimalsEaten;
}

	
	void chirp () {
		System.out.println("chirp");
		
	} void fly () {
		System.out.println("whoosh");
	}

}
