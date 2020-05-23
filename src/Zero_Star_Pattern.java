/*You have an integer N. Print the pattern using * and 0 characters. For example, for N = 3, the pattern would be as follows:
*00*00*
0*0*0*0
00***00
 */

import java.util.*;
public class Zero_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
               if(j==i){
                   System.out.print("*");
               }
               else{
                   System.out.print(0);
               }
            }
            j--;
            System.out.print("*");
            while(j>=0){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(0);
                }
                j--;
            }
            System.out.println();
        }
    }
}
