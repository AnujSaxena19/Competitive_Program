/* Find the non repeating elements in  an array.

 */
import java.util.*;

public class NonRepeatingElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.println(arr[i]);
            }

        }
    }
}
