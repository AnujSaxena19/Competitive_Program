/*Ayush is a spy. Its quite natural for him to go on a secret mission. Once You and Ayush were in the same secret mission, when Ayush felt an urgent need to communicate with Dr. Anand Gupta, who appointed both of you for this mission.
The only way to communicate with him was by sending letters. As both of you were on a secret mission, Ayush will write the letter with some encrypted words which Dr. Anand Gupta was well aware of .
As per the encryption is concerned, the encrypted word will start with the middle character of the string and will be formed henceforth with the middle characters of the left and right substrings (of the middle character of the word) and so on.
Take a look at the explanation of the sample test case for better comprehension. As the letter was going to be quite long, Ayush wants your help to encrypt some critical words for him so that he can quickly finish the letter and sent it to Dr. Anand Gupta.

Sample Input:

2
3
abc
4
abcd
Sample Output:

bac
bacd
Explanation:

In Test Case 2: The word was "abcd"

Middle character of this word is 'b'

Left Substring of 'b' is "a"

Right Substring of 'b' is "cd"

Middle Character of Left Substring of 'b' is 'a'

Middle Character of Right Substring of 'b' is 'c'

There are no other Left Substring for the 'c' in the right substring of 'b'

Right Substring of 'c' is "d"

Middle Character of Right Substring of 'c' is 'd'

There is no other Left or Right Substring of 'd', so we stop here and arrange the middle characters as we have obtained :

"bacd"
 */

import java.util.Scanner;

public class Its_Confidential {

    private static void order(String s,int left,int right){
        if(left<=right){
            int mid=(left+right)/2;
            System.out.print(s.charAt(mid));
            order(s,left,mid-1);
            order(s,mid+1,right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            order(s,0,n-1);
            System.out.println();
        }
    }
}
