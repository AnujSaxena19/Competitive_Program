/*There is a series, , where the next term is the sum of pervious three terms. Given the first three terms of the series, , , and respectively,
 you have to output the nth term of the series using recursion.
 Sample Input 1:
5
1 2 3
Sample Output 1:
11
 */

import java.util.Scanner;

public class Series {
    private static int find_nth_term(int n,int a,int b,int c){
        int [] num=new int[1000];
        num[1]=a;
        num[2]=b;
        num[3]=c;
        for(int i=4;i<=n;i++){
            num[i]=num[i-1]+num[i-2]+num[i-3];
        }
        return num[n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int ans=find_nth_term(n,a,b,c);
        System.out.println(ans);
    }
}
