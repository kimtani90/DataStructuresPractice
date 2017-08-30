import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		
		System.out.println(permutation3("abc", "cba"));
	}
	
	private static boolean permutation(String s1, String s2){
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);																						
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)){
		//if(new String(arr1).equals(new String(arr2))){
		
			return true;
			
		}
		
		return false;
		
	}
	

	private static boolean permutation2(String s1, String s2){
	
		int[] arr=new int[26];
		
		for(int i=0;i<s1.length();i++){
			arr[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s2.length();i++){
			arr[s2.charAt(i)-'a']--;
		}
		
		for(int n:arr){
			if(n>0)
				return false;
		}
		
		return true;
	}
	
	private static boolean permutation3(String s1, String s2){
		
		List<Character> list= new ArrayList<>();
		for(int i=0;i<s1.length();i++){
			list.add(s1.charAt(i));
			
		}
		
		for(int i=0;i<s2.length();i++){
			
			list.remove((Character)s2.charAt(i));
		}
		
		if(list.size()==0){
			return true;
		}
		
		return false;
	}
}
