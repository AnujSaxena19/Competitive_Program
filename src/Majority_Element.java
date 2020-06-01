/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty and the majority element always exist in the array.
 Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

 */

import java.util.*;
public class Majority_Element {
   static public int majorityelement(int [] num,int n){
        int majorityindex=0;
        int count=1;
        for(int i=1;i<n;i++){
           if(num[majorityindex]==num[i]){
               count++;
           }
           else{
               count--;
           }
           if(count==0){
               majorityindex=i;
               count=1;
           }

        }
        return num[majorityindex];
    }

    void printMajority(int [] num,int n){
       int element=majorityelement(num,n);
        if (isMajority(num, n, element))
            System.out.println(element);
        else
            System.out.println("No Majority Element");



    }
    boolean isMajority(int num[], int n, int element)
    {
        int i, count = 0;
        for (i = 0; i < n; i++)
        {
            if (num[i] == element)
                count++;
        }
        if (count > n / 2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Majority_Element majorelement=new Majority_Element();
        int n=sc.nextInt();
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        majorelement.printMajority(num,n);

    }
}
