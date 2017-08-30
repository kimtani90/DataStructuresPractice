import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compress("ssbbbbbccc"));
	}
	
	private static String compress(String s){
		
		int count=0;
		char prev=s.charAt(0);
		char current;
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			
			current=s.charAt(i);
			
			if(current!=prev){
				sb.append(prev).append(count);
				count=1;
				prev=s.charAt(i);
				
			}
			
			else{
				
				count++;
			}
			
		}
		sb.append(prev).append(count);
		return sb.toString();
	}
}
