import java.util.Scanner;

public class Search_Insert_Position {
    public int searchInsert(int [] nums,int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        Search_Insert_Position position=new Search_Insert_Position();

        System.out.println(position.searchInsert(nums,target));
    }
}
