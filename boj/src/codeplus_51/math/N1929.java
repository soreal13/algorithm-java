package codeplus_51.math;

import java.util.Scanner;

// 소수 구하기
public class N1929 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        boolean[] prime = makePrime();

        for (int i=a; i<=b; i++) {
            if(prime[i] == false) System.out.println(i);
        }

    }

    static boolean[] makePrime() {
        boolean[] prime = new boolean[1000001];

        prime[0] = true;
        prime[1] = true;

        for (int i=2; i<= 1000000; i++) {
            if (prime[i] == false) {
                for (int j = 2*i; j<=1000000; j+=i) {
                    prime[j] = true;
                }
            }
        }
        return prime;
    }

}
