package recursion;

public class Recursion {
	public static boolean primecheck(int n, int i) {
		if (n < 2) {
			return false;
		}
		else if (n == 2) {
			return true;
		}
		else if (n % i == 0) {
			return false;
		}
		else if (i < n / 2) {
			return primecheck(n, i + 1);
		} else {
			return true;
		}
	}
}
