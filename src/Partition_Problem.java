import java.util.Scanner;

public class Partition_Problem {
    static boolean isSubsetSum(int [] arr,int n,int sum){
        if(sum==0){
            return true;
        }
        if(n==0 && sum!=0){
            return false;
        }
        if(arr[n-1]>sum){
            return isSubsetSum(arr,n-1,sum);
        }
        return isSubsetSum(arr,n-1,sum)|| isSubsetSum(arr,n-1,sum-arr[n-1]);
    }

    static boolean findPartition(int [] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        return isSubsetSum(arr,n,sum/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(findPartition(arr,n)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
