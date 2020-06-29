import java.util.Scanner;

public class Power_Of_Two {

    public boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        long x=(long)n;
        return (x &(-x))==x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Power_Of_Two power=new Power_Of_Two();
        System.out.println(power.isPowerOfTwo(n));
    }
}
