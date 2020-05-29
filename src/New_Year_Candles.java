/*Vasily the Programmer loves romance, so this year he decided to illuminate his room with candles.
Vasily has a candles.When Vasily lights up a new candle, it first burns for an hour and then it goes out. Vasily is smart, so he can make b went out candles into a new candle. As a result, this new candle can be used like any other new candle.
Now Vasily wonders: for how many hours can his candles light up the room if he acts optimally well? Help him find this number.

Sample Input:
4 2
Sample Output:
7
 */

import java.util.*;
public class New_Year_Candles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a;
        int c;
        while(b<=a){
            c=a/b;
            a=c+(a%b);
            sum+=c;
            if(a<c){
                break;
            }
        }
        System.out.println(sum);
    }
}
