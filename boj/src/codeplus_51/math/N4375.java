package codeplus_51.math;

import java.util.Scanner;

// 1

// 해답 참조 https://cnu-jinseop.tistory.com/43
public class N4375 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int prev = 0;
            for(int i=1; ;i++) {
               prev = (prev*10 +1) % n;
               if (prev == 0) {
                   System.out.println(i);
                   break;
               }
            }
        }
    }

    // pow 함수 사용 시간 초과
    void solution1() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int N = in.nextInt();
            long oneNum = 0;
            int i = 0;

            while (true) {
                // i1 = 10^0
                // i2 = 10^0 + 10^1
                // i3 = 10^0 + 10^1 + 10f^2
                oneNum += Math.pow(10,i);

                if (oneNum % N == 0) {
                    System.out.println(i+1);
                    break;
                }
                i++;
            }
        }

//        // 자리수 구하기
//        int answer = (int)(Math.log10(oneNum)+1);
//        System.out.println(answer);

    }

    // 점화식 시간초과
    void solution2() {
        Scanner in = new Scanner(System.in);

        // 점화식
        // a1 = 1
        // a2 = 11 = a1*10 + 1
        // a3 = 111 = a2*10 +1

        while(in.hasNextInt()) {
            int N = in.nextInt();
            long oneNum = 0;
            int i = 1;

            while(true) {
                oneNum = (oneNum*10) + 1;
                if (oneNum % N == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

    // 시간 초과 long 쓰면 안되는 듯..
    void solution3 () {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            long oneNum = 1;
            for(int i=0; ;i++) {
                oneNum = (oneNum*10) + 1;
                if (oneNum % n == 0) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
