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
        String arr[] = new String[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int q = in.nextInt();
        String arr1[] = new String[q];
        for(int arr_i=0; arr_i < q; arr_i++){
            arr1[arr_i] = in.next();
        }
        
        countStr(arr, arr1);
        
    }
    
    public static void countStr(String[] arr, String[] arr1){
        
        List<String> strList= Arrays.asList(arr);
        
        for (String findStr : arr1){
            int count=0;
            if(strList.contains(findStr)){
                count = Collections.frequency(strList, findStr);
                
            }
            System.out.println(count);
            
        }
    }
}