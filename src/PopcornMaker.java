import javax.swing.JOptionPane;

import extra.Microwave;

public class PopcornMaker {
public static void main(String[] args) {
	String fav = JOptionPane.showInputDialog("What Flavor would you like");
	String tim = JOptionPane.showInputDialog("How long would you like it cooked?");
	int t = Integer.parseInt(tim);
	Popcorn pop = new Popcorn(fav);
	Microwave micro = new Microwave();
	
	micro.setTime(t);
	micro.putInMicrowave(pop);
	micro.startMicrowave();
	pop.applyHeat();
	pop.eat();
	
}
}
