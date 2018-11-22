
public class Vault {
boolean tryCode(int code) {
	if (code == 123456789) {
		return true;
	}else {
		return false;
	}
}
}

class JamesBond{
	int findCode(Vault vlt) {
		for (int i = 0; i < 1000000000; i++) {
			if (vlt.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
