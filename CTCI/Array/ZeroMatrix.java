
public class ZeroMatrix {

	public static void main(String[] args) {
	
		int[][] a={{0,2,3},{4,5,6},{7,8,9}};
		
		int[][] b=check(a);
		for(int i=0;i<b.length;i++){
			System.out.println();
			for(int j=0;j<b[0].length;j++){
				System.out.print(b[i][j]+" ");
				
			}
		}
	}
	
	private static int[][] check(int a[][]){
		int row=a.length;
		int col=a[0].length;
		boolean[] rArr=new boolean[row];
		boolean[] cArr=new boolean[col];
		
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==0){
					rArr[i]=true;
					cArr[j]=true;
				}
			}
		}
		
		for(int i=0;i<rArr.length;i++){
			if(rArr[i]==true){
				
				for(int j=0;j<a[0].length;j++)
					a[i][j]=0;
			}
		}
		
		for(int i=0;i<cArr.length;i++){
			if(cArr[i]==true){
				for(int j=0;j<a.length;j++){
					a[j][i]=0;
				}
			}
		}
		
		return a;
	}
}
