import java.util.Scanner;

public class SingleElementInASortedArray {

    private int singlenonDuplicate(int [] nums){
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length/2;i=i+2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
            if(nums[nums.length-1-i]!=nums[nums.length-2-i]){
                return nums[nums.length-1-i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        SingleElementInASortedArray unique=new SingleElementInASortedArray();
        System.out.println(unique.singlenonDuplicate(nums));

    }

}
