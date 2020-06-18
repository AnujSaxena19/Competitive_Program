/*A tourist is visiting Byteland. The tourist knows English very well. The language of Byteland is rather different from English. To be exact it differs in following points:
Bytelandian alphabet has the same letters as English one, but possibly different in meaning. Like 'A' in Bytelandian may be 'M' in English. However this does not mean that 'M' in Bytelandian must be 'A' in English.
More formally, Bytelindian alphabet is a permutation of English alphabet. It will be given to you and could be any possible permutation. Don't assume any other condition.
People of Byteland don't like to use invisible character for separating words. Hence instead of space (' ') they use underscore ('_'). Other punctuation symbols, like '?', '!' remain the same as in English.
The tourist is carrying "The dummies guide to Bytelandian", for translation. The book is serving his purpose nicely. But he is addicted to sharing on BaceFook, and shares his numerous conversations in Byteland on it.
The conversations are rather long, and it is quite tedious to translate for his English friends, so he asks you to help him by writing a program to do the same.

Sample Input:

5 qwertyuiopasdfghjklzxcvbnm
Ph
Pcssi
Bpke_kdc_epclc_jcijsc_mihyo?
Epcf_kdc_liswhyo_EIED_hy_Vimcvpcn_Zkdvp_siyo_viyecle.
Ipp!
Sample Output:

Hi
Hello
What are these people doing?
They are solving TOTR in Codechef March long contest.
Ohh!
Explanation:

The string "qwertyuiopasdfghjklzxcvbnm" means that 'a' in Bytelandian is 'q' in English, 'b' in Bytelandian is 'w' in English, 'c' in Bytelandian is 'e' in English and so on.
Thus to translate "Ph" (first sentence in example) to English:
1)We find that 'p' in Bytelandian means 'h' in English. So we replace 'P' with 'H'.
2) Then we see that 'h' in Bytelandian means 'i' in English. So we replace 'h' with 'i'.
3) Therefore, the translation is "Hi".
 */

import java.util.Scanner;

public class Tourist_Translation {

    private static String solve(String M,String S){
        StringBuilder result=new StringBuilder();
        for(char C:S.toCharArray()){
            if(Character.isLetter(C)){
                char lower=Character.toLowerCase(C);
                result.append((char) (C-lower +M.charAt(lower-'a')));
            }
            else if(C=='_'){
                result.append(' ');
            }
            else{
                result.append(C);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String M=sc.next();
        for(int i=0;i<T;i++){
            String S=sc.next();
            System.out.println(solve(M,S));
        }
    }
}
