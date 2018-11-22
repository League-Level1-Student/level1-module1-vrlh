
public class VaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	
	JamesBond James = new JamesBond();
	System.out.println(James.findCode(v));
	
}
}
