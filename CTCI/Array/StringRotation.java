
public class StringRotation {

	
	public static void main(String[] args) {
		String s="watermelon";
		System.out.println(isSubString(s+s, "termelonwa"));
	}
	
	private static boolean isSubString(String s1, String s2){
		
		return s1.contains(s2);
	}
}
