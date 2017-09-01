
public class PalindromePermutation {

	public static void main(String[] args) {
		
		PalindromePermutation p = new PalindromePermutation();
		System.out.println(p.checkPalindrome("taco cat"));
		
	}
	
	public boolean checkPalindrome(String s){
		
		int arr[]= new int[26];
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ')
				arr[s.charAt(i)-'a']++;
		}
		
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
			if(arr[i]%2!=0)
				count++;
				
		}
		
		if(count>1)
			return false;
		return true;
	}
}
