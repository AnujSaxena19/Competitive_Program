/*Program to display the following pattern: For n = 5;
Sample Output 0

1
1 2
3 5 8
13 21 34 55
89 144 233 377 610
 */


import java.util.Scanner;

public class Fibonacci_Triangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = k * (k + 1) / 2;
        int[] fib = new int[n];
        fib[0]= 1;
        fib[1]= 1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        int fibnum=0;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fib[fibnum++]+" ");

            }
            System.out.println();
        }
    }

}
