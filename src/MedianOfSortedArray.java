/* Program  to find the median of two sorted array after merging them.

 */
import java.util.Scanner;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] merge = new int[2 * n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        int i=0, j=0,k=0;
        while(i<n && j<n){
            if(a1[i]<a2[j]){
                merge[k++]=a1[i++];
            }
            else{
                merge[k++]=a2[j++];
            }
        }
        while(i<n){
            merge[k++]=a1[i++];
        }
        while(j<n){
            merge[k++]=a2[j++];
        }
        int mid=(merge.length/2)-1;
        int right=mid+1;
        int median=(merge[mid]+merge[right])/2;
        System.out.println(median);
    }
}
