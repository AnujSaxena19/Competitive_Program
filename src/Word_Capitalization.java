/*Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.
Note, that during capitalization all the letters except the first one remains unchanged.
Input Format:
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters.
Sample Input:
ApPLe
Sample Output:
ApPLe
*/
import java.util.Scanner;
public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String output=s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(output);
    }
}
