package OOPS11;

public class all_prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct = 0, i = 1, j = 1, n = 0;
		while (n < 25) {
			j = 1;
			ct = 0;

			while (j <= i) {
				if (i % j == 0)
					ct++;
				j++;
			}
			if (ct == 2) {
				System.out.printf("%d ", i);
				n++;
			}
			i++;
		}
	}

}


