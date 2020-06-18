/*Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not.
An anagram of a string is another string that contains same characters, only the order of characters can be different.
For example, “act” and “tac” are anagram of each other.
Sample Input:

2
this isth
allergy allergic
Sample Output:

YES
NO
Note:Do not use sorting.
 */



import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String a=sc.next();
            String b=sc.next();
            int [] var=new int[26];
            if(a.length()==b.length()){
                for(int i=0;i<a.length();i++){
                    var[a.charAt(i)-97]++;
                    var[b.charAt(i)-97]--;
                }
                int count=0;
                for(int i=0;i<26;i++){
                    if(var[i]!=0){
                        count=1;
                        break;
                    }
                }
                if(count==1){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
