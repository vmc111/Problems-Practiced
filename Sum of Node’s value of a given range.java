import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Question link : https://unstop.com/code/practice/250874

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int noofnodes = input.nextInt();
        int[] nodes =new int[noofnodes];
        for (int i=0; i<noofnodes; i++){
            nodes[i] = input.nextInt();
        }
        int start = input.nextInt();
        int end = input.nextInt();

        System.out.println(sumofNodes(nodes , start , end));

    }
    static int sumofNodes(int[] arr, int start, int end){
        int sum=0;
        for (int element : arr){
            if(start<=element && element<=end){
                sum+=element;
            }

        }
        return sum;
    }
}
