package codeplus_51.dynamic.part1;

import java.util.Scanner;

// 1로 만들기
// 문제는 재밌네...
//10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다. <- 이게..
// 재귀 탐색인 거 같은데... -> 이건 맞음
public class N1463 {

    static Integer[] dp;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(n));


    }

    static int recur(int n) {

        if (dp[n] == null) {

            if(n % 6 == 0) {
                dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else {
                dp[n] = recur(n - 1) + 1;
            }

        }

        return dp[n];
    }

}


//, 6으로 나눠지는 경우는 3으로 나누는 경우와 2로 나누는 경우, 1을 빼는 경우 모두 재귀호출 하여 3가지 경우 중 최솟값으로 DP를 갱신해야 하고,
// 3으로만 나눠지는 경우는 3으로 나누는 경우와 1을 빼는 경우를 재귀호출,
// 2로만 나눠지는 경우는 2로 나누는 경우와 1을 빼는 경우의 수를 재귀호출,
// 그 외에는 1을 빼는 경우만 재귀호출