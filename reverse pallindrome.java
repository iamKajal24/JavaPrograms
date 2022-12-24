public class reversstringpallindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		int len = str.length();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (str.equals(rev)) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");
		}

	}
}


