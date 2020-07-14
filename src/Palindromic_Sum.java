/*Program to find maximum even length of palindromic sum substring. Find the length of longest contiguous substring of a
string such that the length of the substring is 2*N digits and the sum of the leftmost N digits is equal to the sum of rightmost N digits.
If there is no such substring then return 0.
Sample Input 1:
13267224
Sample Output 1:
6
Explanation 1:
String "326722" has 6 digits. Sum of first 3 digits is 3+2+6 = 11 = 7+2+2 = sum of last 3 digits.

Sample Input 2:
1333379
Sample Output 2:
4
 */

import java.util.Scanner;

public class Palindromic_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int [] sum=new int[n+1];
        sum[0]=0;
        for(int i=1;i<=n;i++){
            sum[i]=(sum[i-1]+str.charAt(i-1)-'0');
        }
        int ans=0;
        for(int len=2;len<=n;len+=2){
            for(int i=0;i<n-len;i++){
                if (sum[i+len/2] - sum[i] == sum[i+len] - sum[i+len/2]){
                    ans = Math.max(ans, len);
                }
            }
        }
        System.out.println(ans);
    }

}
