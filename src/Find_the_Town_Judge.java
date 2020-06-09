import java.util.Scanner;

public class Find_the_Town_Judge {
    private int Findjudge(int N, int[][] trust) {
        if (trust.length < N - 1) {
            return -1;
        }
        int[] trustedby = new int[N + 1];
        int[] trusts = new int[N + 1];
        for (int[] rel : trust) {
            trusts[rel[0]]++;
            trustedby[rel[1]]++;
        }
        for (int i = 1; i < N + 1; i++) {
            if (trusts[i] == 0 && trustedby[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Find_the_Town_Judge findTwnJd = new Find_the_Town_Judge();
        System.out.println(findTwnJd.Findjudge(N, trust));
    }
}
