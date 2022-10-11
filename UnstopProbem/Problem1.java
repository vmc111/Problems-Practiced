import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Question: https://unstop.com/code/practice/250721

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = in.nextInt();
        }
        int [] ans = Push(arr);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
   static int[] Push(int[] arr){
		int end = arr.length-1;
		int count = 0; 
		for (int i=0; i<=end;i++) {
		while (arr[i] == 0) {
			if (i >= end-count) {
				break;
			}
				for (int j = i; j <= end-count-1; j++) {
					arr[j] = arr[j+1];
				}
				arr[end-count]=0;
				count+=1;
		}
		}
		return arr;
	}
}
