/*Vanya walks late at night along a straight street of length l, lit by n lanterns. Consider the coordinate system with the beginning of the street corresponding to the point 0, and its end corresponding to the point l. Then the i-th lantern is at the point ai. The lantern lights all points of the street that are at the distance of at most d from it, where d is some positive number, common for all lanterns.
Vanya wonders: what is the minimum light radius d should the lanterns have to light the whole street?

Sample Input:
7 15
15 5 3 7 9 14 0
Sample Output:
2.50000000000000000000
 */

import java.util.*;
public class Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int max=0;
        for(int i=0;i<a.length-1;i++){
            int diff=a[i+1]-a[i];
            if(diff>max){
                max=diff;
            }
        }
        double d=max/2.0;
        System.out.println(String.format("%.20f",d));

    }
}
