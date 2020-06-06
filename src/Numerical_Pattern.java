/*Write a program to print the following pattern: For example, n = 4; Output:

1*2*3*4
9*10*11*12
13*14*15*16
5*6*7*8

 */

import java.util.*;
public class Numerical_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i=i+2){
            int k=(i)*n+1;
            for(int j=0;j<n-1;j++) {
                System.out.print(k + "*");
                k++;
            }
            System.out.println(k);
        }
        int k;
        for(int i=n;i>1;i=i-2){
            if(n%2==0){
                k=(i-1)*n+1;
            }
            else{
                k=(i-2)*n+1;
            }
            for(int j=0;j<n-1;j++){
                System.out.print(k+"*");
                k++;
            }
            System.out.println();

        }

    }
}
