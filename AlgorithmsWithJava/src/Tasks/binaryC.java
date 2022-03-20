//package Tasks;

import java.util.Scanner;

public class binaryC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int n[] = new int[N];
        int k[] = new int[K];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < K; i++) {
            k[i] = sc.nextInt();
        }

        for (int i = 0; i < k.length; i++) {
            search(k[i], n);
        }


    }

    private static void search(int K, int[] n) {
        int L = 0;
        int M = n.length / 2;
        int R = n.length - 1;

        int count = 0;

        while (L <= R) {
            if (K == n[M]) {
                System.out.println("YES");
                return;
            } else {
                if (K > n[M]) {
                    L = M + 1;
                } else if (K < n[M]) {
                    R = M - 1;
                }
                M = (L + R) / 2;
            }


            //count++;
/*            System.out.println(count);

            System.out.println("The L is " + L);
            System.out.println("The R is " + R);
            System.out.println("The M is " + M);*/

/*            if(count > 100){
                System.out.println("Too much for me");
                break;
            }*/
        }

        System.out.println("NO");
    }

}
