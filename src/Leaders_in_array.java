/*Given an integer array A of size n. Find and print all the leaders present in the input array.
 An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i]. Print all the leader elements separated by space and in the same order they are present in the input array.

Sample Input:

6
3 12 34 2 0 -1
Sample Output:

34 2 0 -1
 */
import java.util.*;
public class Leaders_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j;
            for( j=i+1;j<n;j++){
                if(a[i]<=a[j]){
                    break;
                }
            }
            if(j==a.length){
                System.out.print(a[i]+" ");
            }
        }
    }

}
