package OOPS11;

public class anagram {

	public static void main(String[] args) {
		
		String s1 = "race";
		String s2 = "ecar";

		if (s1.length() != s2.length()) {
			System.out.println("not anagram");
		}
		for (int i = 0; i < s1.length(); i++) 
		{
			for (int j = s1.length() - 1; j > 0; j--)
			{
				if (s1.charAt(i) == s2.charAt(j)) 
				{
					System.out.println("anagram");
					break;
				}
			}
		}
	}

}
