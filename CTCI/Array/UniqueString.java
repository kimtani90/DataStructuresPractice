
public class UniqueString {

	public static void main(String[] args) {
		
		UniqueString d= new UniqueString();
		
		System.out.println(d.repeatedElement("aabc"));
	}
	
	public boolean repeatedElement(String str){
		
		int alpha=0;
		
		for(int i=0;i<str.length();i++){
			
			int index=str.charAt(i)-'a';
			
			int alphaValue=(int) Math.pow(2, index);
			
			if((alphaValue & alpha) ==0)
				alpha=alpha^alphaValue;
			
			else
				return true;
			
		}
		
		return false;
		
		
	}
}
