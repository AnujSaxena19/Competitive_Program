import java.util.Scanner;

public class Coin_Change2 {
    public int change(int amount,int [] coins){
        int [] ch=new int[amount+1];
        ch[0]=1;
        for(int coin:coins){
            for(int i=coin;i<amount+1;i++){
                ch[i]=ch[i]+ch[i-coin];
            }
        }
        return ch[amount];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        int [] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        Coin_Change2 denominations=new Coin_Change2();
        System.out.println(denominations.change(amount,coins));
    }
}
