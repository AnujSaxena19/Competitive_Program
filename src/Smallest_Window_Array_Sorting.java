import java.util.Scanner;

public class Smallest_Window_Array_Sorting {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int leftindex=-1,rightindex=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(a[i]<max){
                rightindex=i;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(min>a[i]){
                min=a[i];
            }
            if(a[i]>min){
                leftindex=i;
            }
        }
        System.out.println(leftindex+" "+rightindex);
    }
}
