import java.util.Scanner;

public class FloodFill {

    private static void floodFill(int [][]image,int sr,int sc,int newColor){
        int oldColor=image[sr][sc];
        floodFillHelper(image,sr,sc,oldColor,newColor);
    }


    private static void floodFillHelper(int [][]image ,int sr,int sc,int oldColor,int newColor){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image.length){
            return;
        }
        if (image[sr][sc] != oldColor||image[sr][sc]==newColor) {
            return;
        }
        image[sr][sc]=newColor;
        floodFillHelper(image, sr-1, sc, oldColor,newColor);
        floodFillHelper(image, sr+1, sc, oldColor, newColor);
        floodFillHelper(image, sr, sc-1, oldColor, newColor);
        floodFillHelper(image, sr, sc+1, oldColor, newColor);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r =s.nextInt();
        int c=s.nextInt();
        int image[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                image[i][j]=s.nextInt();
            }
        }
        int sr=s.nextInt();
        int sc=s.nextInt();
        int newColor=s.nextInt();
        floodFill(image,sr,sc,newColor);
        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }


    }
}
