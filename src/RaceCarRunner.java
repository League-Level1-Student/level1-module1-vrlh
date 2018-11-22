

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar McQueen = new RaceCar("lightning", 5);
		// 2. Print the RaceCar's position in the race
System.out.println(McQueen.getPositionInRace());
		// 3. Crash the RaceCar
McQueen.crash();		
// 4. If the car is damaged. Bring it in for a pit stop.
if (McQueen.damaged == true) {
	McQueen.pit();
}
		// 5. Help the car move into first place.
while (McQueen.getPositionInRace() > 1) {
	McQueen.overtake();
}
	}
}
