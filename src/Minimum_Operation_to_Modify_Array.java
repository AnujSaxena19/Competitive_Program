/*Given an array A[], the task is to find the minimum number of operations required to convert the array into B[].
Such that for every index in B (except the last) parity(b[i]) != parity(b[i + 1]) where parity(x) = x % 3.

 Sample Input:
4
2 1 3 0
Sample Output:
1
Explanation:

1 can be added to 0 in a single operation and the array becomes {2, 1, 3, 1}.
 */
import java.util.*;
public class Minimum_Operation_to_Modify_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()%3;
            if(a[i]<0){
                a[i]+=3;
            }
        }
        int i=0;
        int count=0;
        while(i<n-1){
            if(a[i]==a[i+1]){
                i++;
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
