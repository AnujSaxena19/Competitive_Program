import java.util.Scanner;

public class Is_Subsequence {

    public boolean isSubsequence(String s,String t){
        if(s==null ||s.isEmpty()){
            return true;
        }
        int index=-1;
        for(char c:s.toCharArray()){
            index=t.indexOf(c,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();

        Is_Subsequence subsequence=new Is_Subsequence();
        System.out.println(subsequence.isSubsequence(s,t));

    }

}

