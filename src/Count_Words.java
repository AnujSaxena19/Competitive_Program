/*Given a string S, count number of words in the string.

 */
import java.util.*;
public class Count_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer wordCount=new StringTokenizer(s);
        System.out.println(wordCount.countTokens());
    }
}
