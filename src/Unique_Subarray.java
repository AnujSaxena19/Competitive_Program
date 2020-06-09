/*A contiguous subarray is defined as unique if all the integers contained within it occur exactly once. There is a unique weight associated with each of the subarray. Unique weight for any subarray equals it's length if it's unique, 0 otherwise. Your task is to calculate the sum of unique weights of all the contiguous subarrays contained within a given array.
Input : arr[] = {1, 2, 3}
Output : 10
{1, 2, 3} is a subarray of length 3 with distinct elements. Total length of length three = 3.
{1, 2}, {2, 3} are 2 subarray of length 2 with distinct elements. Total length of lengths two = 2 + 2 = 4
{1}, {2}, {3} are 3 subarrays of length 1 with distinct element. Total lengths of length one = 1 + 1 + 1 = 3
Sum of lengths = 3 + 4 + 3 = 10
Input : arr[] = {1, 2, 1}
Output : 7

 */
import java.util.*;
public class Unique_Subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> brr=new ArrayList<>();
            brr.add(arr[0]);
            int i=1;
            int s=0;
            while(i<n){
                if(brr.contains(arr[i])){
                    s+=brr.size()*(brr.size()+1)/2;
                    brr.remove(0);
                }
                else{
                    brr.add(arr[i]);
                    i++;
                }
            }
            while(brr.size()>0){
                s+=brr.size()*(brr.size()+1)/2;
                brr.remove(0);
            }
            System.out.println(s);
        }
    }
}
