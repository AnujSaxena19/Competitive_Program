/*Program to display the following pattern:

1        1
12      21
123    321
1234  4321
1234554321
Sample Input:

5
Sample Output:

1        1
12      21
123    321
1234  4321
1234554321
 */

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int j;
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=i*2;j<n*2;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
