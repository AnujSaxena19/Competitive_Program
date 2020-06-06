/*Given an array of N integers and a number K, the task is to find the number of subarrays such that all elements are greater than K in it.

Examples:

Input: N= 8, a[] = {3, 4, 5, 6, 7, 2, 10, 11}, K = 5 Output: 6 The possible subarrays are {6}, {7}, {6, 7}, {10}, {11} and {10, 11}.

Input:N=9, a[] = {8, 25, 10, 19, 19, 18, 20, 11, 18}, K = 13 Output: 12

 */
import java.util.*;
public class Count_Subarray_Greater_than_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        int result=0;
        for(int i=0;i<n;i++){
            if(x[i]>k){
                c=c+1;
            }
            else{
                result=result+(c*(c+1))/2;
                c=0;
            }
        }
        if(c>0) {
            result=result+(c*(c+1))/2;
        }
        System.out.println(result);
    }
}
