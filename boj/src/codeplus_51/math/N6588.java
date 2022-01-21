package codeplus_51.math;


import java.util.Scanner;

// 골드바흐의 추측
public class N6588 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean[] prime = makePrime();

        while(in.hasNextInt()) {
            int n = in.nextInt();

            if (n == 0) break;

            int start = 2;
            int end = n-2;

            while(true) {
                if (!prime[start] && !prime[end]) {
                    System.out.println(n + " = " + start+ " + " + end);
                    break;
                }
                start++;
                end--;
            }


        }

    }

    static boolean[] makePrime() {
        boolean[] prime = new boolean[1000001];

        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<=1000000; i++) {
            if (!prime[i]) {
                for (int j=2*i; j<=1000000; j+=i) {
                    prime[j] = true;
                }
            }
        }

        return prime;
    }
}
