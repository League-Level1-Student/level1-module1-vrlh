
public class CatRunner {
public static void main(String[] args) {
	Cat hi = new Cat("this is the name");
	hi.meow();
	hi.printName();
	for (int i = 0; i < 9; i++) {
		hi.kill();
	}
	
	
}
}
