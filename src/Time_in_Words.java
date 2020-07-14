/*Given the time in numerals we may convert it into words, as shown below:

At , use o' clock. For , use past, and for  use to. Note the space between the apostrophe and clock in o' clock.
Write a program which prints the time in words for the input given in the format described.

Sample Input 1:
5
47
Sample Output 1:
thirteen minutes to six

Sample Input 2:
3
00
Sample Output 2:
three o' clock
Sample Input 3:
7
15
Sample Output 3:
quarter past seven
 */

import java.util.Scanner;

public class Time_in_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        String [] num={ "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };

        if(m==0){
            System.out.println(num[h] + " o' clock ");
        }
        else if(m==1){
            System.out.println("one minute past " + num[h]);
        }
        else if(m==15) {
            System.out.println("quarter past " + num[h]);
        }
        else if(m==30){
            System.out.println("half past " + num[h]);
        }
        else if(m==45){
            System.out.println("quarter past to " + num[(h%12)+1]);
        }
        else if(m==59){
            System.out.println("one minute to " + num[(h % 12) + 1]);
        }
        else if(m<30){
            System.out.println( num[m] + " minutes past " + num[h]);
        }
        else {
            System.out.println( num[60 - m] + " minutes to " + num[(h % 12) + 1]);
        }

    }
}
