package codeplus_51.math;


import java.util.Scanner;

// 최대공약수와 최소공배수
public class N2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 최대공약수
        int min = 0;
        for (int i=1; i<=b; i++) {
            if (a % i == 0 && b % i == 0) min = i;
        }
        System.out.println(min);

        // 최소공배수
        int max = 0;
        int i = a;
        while (true) {

            if ( ( i % a ==0) && ( i % b == 0) ) break;

            i++;

        }
        max = i;
        System.out.println(max);

    }
}
