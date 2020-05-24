/*Given an array of integers of size n which contains numbers from 0 to n - 2. Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the array.
Sample Input:
9
0 7 2 5 4 7 1 3 6
Sample Output:
7
 */

import  java.util.*;
public class Find_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
                if(a[i]==a[i+1]){
                    System.out.println(a[i]);
                }
        }
    }
}

