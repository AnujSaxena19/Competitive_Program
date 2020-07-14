/*In Berland it is the holiday of equality. In honor of the holiday the king decided to equalize the welfare of all citizens in Berland by the
expense of the state treasury.Totally in Berland there are n citizens, the welfare of each of them is estimated as the integer in ai burles
(burle is the currency in Berland).You are the royal treasurer, which needs to count the minimum charges of the kingdom on the king's present.
The king can only give money, he hasn't a power to take away them.

Sample Input 1:
5
0 1 2 3 4
Sample Output 1:
10

 */

import java.util.Scanner;

public class Holiday_of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max= arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int s=0;
        for (int i:arr) {
            s=s+max-arr[i];
        }
        System.out.println(s);
    }
}
