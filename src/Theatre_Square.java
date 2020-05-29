/*Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.
What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

Sample Input:
6 6 4
Sample Output:
4
 */
import java.util.*;
public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int x=(int)Math.ceil(n*1.0/a);
        int y=(int)Math.ceil(m*1.0/a);

        System.out.println(x*y);

    }
}
