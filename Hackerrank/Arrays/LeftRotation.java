import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rotate = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        leftRotate(arr,rotate,n);
        
    }
    
    public static void leftRotate(int[] arr, int rotate, int len){
        
        for (int i=0;i<len;i++){
            
            if(rotate != len){
                System.out.print(arr[rotate]+ " ");
                rotate++;
            }
            else{
                rotate=0;
                System.out.print(arr[rotate]+ " ");
                rotate++;
            }
            
        }
        
    }
}