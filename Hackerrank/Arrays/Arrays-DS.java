import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
        }
        
        
            revArray(arr,n);
    }
    
    public static void revArray(int[] sampleArray, int len){
        
        for (int i=len-1; i>=0; i--){
            System.out.print(sampleArray[i]+ " ");
        }
    }
}
