import java.util.ArrayList;
import java.util.List;

public class OneAway {

	public static void main(String[] args) {
		System.out.println(compareStrings("pale","ple"));
	}
	
	private static boolean compareStrings(String s1, String s2){

		int i=0,j=0, count=0;
		
		while(i<s1.length() || j<s2.length()){
			
			if(s1.charAt(i)==s2.charAt(j)){
				
				i++;j++;
			}
			
			else{
				
				count++;
				
				if(count>1){
					return false;
				}
				
				if(s1.length()<s2.length()){
					j++;
				}
				else if(s1.length()>s2.length()){
					i++;
				}
				
				else{
					i++; j++;
				}
			}
			
			
		}
		
		return true;
	}
}
