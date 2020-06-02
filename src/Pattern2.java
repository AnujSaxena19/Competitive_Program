/*Sample input:
7
7

Sample output:
1111111
11 1 11
1 111 1
1111111
1 111 1
11 1 11
1111111
 */
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||j==1||i==row||j==column||i==row/2+1||j==column/2+1||i==j||i==column-j+1){
                    System.out.print(1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
