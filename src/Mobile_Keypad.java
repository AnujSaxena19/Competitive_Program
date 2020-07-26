/*Program to count total possible combinations of N-digits numbers in a mobile keypad.
{{1,2,3}
{4,5,6}
{7,8,9}
{*,0,#}}
For example N=2  the combinations are-
00, 08, 11, 12, 14, 21, 22, 23, 25, 32, 33, 36, 41, 44, 45, 47,...96,98,99
 */
import java.util.*;
public class Mobile_Keypad {

    static int [] row={0,0,-1,0,1};
    static int [] col={0,-1,0,1,0};
    static int getCountUtil(char keypad[][],int i,int j,int n ){
        if(keypad==null || n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int k=0,move=0,r=0,c=0,totalCount=0;
        for(move=0;move<5;move++){
            r=i+row[move];
            c=j+col[move];
            if(r>=0 && r<=3 && c>=0 && c<=2 && keypad[r][c]!='*' && keypad[r][c]!='#'){
                totalCount+=getCountUtil(keypad,r,c,n-1);
            }
        }
        return totalCount;
    }

    static int getCount(char keypad[][],int n){
        int totalCount=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(keypad[i][j]!='*' && keypad[i][j]!='#'){
                    totalCount+=getCountUtil(keypad,i,j,n);
                }
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char keyboard[][]={{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};
        int n=sc.nextInt();
        System.out.println(getCount(keyboard,n));
    }
}
