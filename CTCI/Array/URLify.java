public class URLify {

	public static void main(String[] args) {
		URLify url=new URLify();
		System.out.println(url.urlify("Mr John Smith      ", 13 ));
	}
	
	private String urlify(String s, int length){
		
		int strLength= s.length();
		
		char[] arr= new char[strLength];
		int k=0;
		for(int i=0;i<length;i++){
			if(s.charAt(i)!=' '){
				arr[k]= s.charAt(i); 
				k++;
			}	
			else{
				arr[k]='%';
				arr[k+1]='2';
				arr[k+2]='0';
				k+=3;
			}
		}
		
		
		return new String(arr);
	}
}
