import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String {
    private void reverseString(char [] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[right];
            s[right]=s[left];
            s[left]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char [] s=new char[n];
        String r;
        r=sc.next();
        for(int i=0;i<n;i++){
            s[i]= r.charAt(i);
        }
        Reverse_String reverse=new Reverse_String();
        reverse.reverseString(s);

        System.out.println(Arrays.toString(s));

    }
}
