import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
       int max= maxHourGlass(arr);
        System.out.print(max);
    }
    
    public static int maxHourGlass(int[][] a){
        
        List<Integer> hourGlassList = new ArrayList<Integer>();
        for (int i=0;i<=3;i++){
            for (int j=0;j<=3;j++){
                hourGlassList.add(a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
                
            }
        }
        return Collections.max(hourGlassList);
    }
}
