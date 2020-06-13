import java.util.Scanner;

public class Remove_K_Digits {
    private String removeKdigits(String num,int k){
        StringBuilder sb=new StringBuilder(num);
        while(k-->0){
            int i=1;
            for(;i<sb.length();i++){
                if(sb.charAt(i-1)>sb.charAt(i)) {
                    break;
                }
            }
            sb.delete(i-1,i);
            i=0;
            for(;i<sb.length();i++){
                if(sb.length()==0 || sb.charAt(i)!='0'){
                    break;
                }
            }
            if(i>0){
                sb.delete(0,i);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int k=sc.nextInt();
        Remove_K_Digits digit=new Remove_K_Digits();

        System.out.println(digit.removeKdigits(num,k));
    }
}
