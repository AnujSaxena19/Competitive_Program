/*Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.
Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false

 */
import java.util.*;
public class Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Valid_Perfect_Square sqrt=new Valid_Perfect_Square();
        System.out.println(sqrt.isPerfectSquare(num));

    }
    private boolean isPerfectSquare(int num) {
        long l=1;
        long r=num;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}
