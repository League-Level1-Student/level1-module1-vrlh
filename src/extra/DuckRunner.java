package extra;

public class DuckRunner {
	public static void main(String[] args) {
		Duck d = new Duck("NotDucks", 123456); 
		d.fly();
		d.chirp();
		d.chirp();
		d.fly();
	}

}
