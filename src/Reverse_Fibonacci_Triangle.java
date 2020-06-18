/*Write a Program to print following Pattern
Sample Input:

8
Sample Output:

14930352
9227465   5702887
3524578   2178309   1346269
832040    514229    317811    196418
121393    75025     46368     28657     17711
10946     6765      4181      2584      1597      987
610       377       233       144       89        55        34
21        13        8         5         3         2         1         1
 */

import java.util.Scanner;

public class Reverse_Fibonacci_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=k*(k+1)/2;
        int [] fib=new int[n];
        fib[0]=fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=(fib[i-1]+fib[i-2])%1000000007;
        }
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%-10d",fib[n-1]);
                n--;
            }
            System.out.println();
        }
    }

}
