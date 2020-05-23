/*Print the following pattern for given number of rows.
Sample Input:
5
Sample Output:
5432*
543*1
54*21
5*321
*4321
*/
import java.util.*;
public class Number_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i!=j){
                    System.out.print(j);

                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
