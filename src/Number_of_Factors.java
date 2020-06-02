/*Alice has learnt factorization recently. Bob doesn't think she has learnt it properly and hence he has decided to quiz her.
Bob gives Alice a very large number and asks her to find out the number of factors of that number. To make it a little easier for her, he represents the number as a product of N numbers.
Alice is frightened of big numbers and hence is asking you for help. Your task is simple. Given N numbers, you need to tell the number of distinct factors of the product of these N numbers.

Sample Input:

3
3
3 5 7
3
2 4 6
2
5 5
Sample Output :

8
10
3
 */

import java.util.*;
public class Number_of_Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] a=new int[n];
            long mul=1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                mul=mul*a[i];
            }
            int c=0;
            for(int i=1;i<=(long)Math.sqrt(mul);i++){
                if(mul%i==0){
                    c=c+2;
                }
            }
            if((long)Math.sqrt(mul)==Math.sqrt(mul)){
                c--;
            }
            System.out.println(c);
        }
    }

}
