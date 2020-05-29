/*You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:
Each domino completely covers two squares.
No two dominoes overlap.
Each domino lies entirely inside the board. It is allowed to touch the edges of the board.
Find the maximum number of dominoes, which can be placed under these restrictions.

Sample Input:
2 4
Sample Output:
4
 */

import java.util.*;
public class Domino_Piling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(m*n/2);
    }
}
