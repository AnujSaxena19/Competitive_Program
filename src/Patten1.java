/*Program to display following pattern
        11111
        1   1
        1   1
        1   1
        11111

Sample Input:

5
5
Sample Output:

11111
1   1
1   1
1   1
11111
*/
import java.util.*;
public class Patten1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print(1);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
