/*Limak is going to participate in a contest on the last day of the 2016. The contest will start at 20:00 and will last four hours, exactly until midnight. There will be n problems, sorted by difficulty, i.e. problem 1 is the easiest and problem n is the hardest. Limak knows it will take him 5·i minutes to solve the i-th problem.
Limak's friends organize a New Year's Eve party and Limak wants to be there at midnight or earlier. He needs k minutes to get there from his house, where he will participate in the contest first.
How many problems can Limak solve if he wants to make it to the party?

Sample Input:
3 222
Sample Output:
2
 */

import java.util.*;
public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int minute=240-k;
        int total;
        int c=0;
        for(int i=1;i<=n;i++){
            total=+i*5;
            if(total<=minute){
                c++;
                minute=minute-total;
            }
            else{
                break;
            }
        }
        System.out.println(c);
    }
}
