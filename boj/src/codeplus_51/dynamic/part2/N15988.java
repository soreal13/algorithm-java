package codeplus_51.dynamic.part2;

import java.util.Scanner;

// 1,2,3 더하기 3

// 오버플로우, 분배법칙, long형, 숫자 클때 숫자 제대로 썼는지 확인
public class N15988 {

    public static void main(String[] args) {

        //점화식
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[] dp = new long[1000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i=4; i<1000001; i++){
//            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; // 오버 플로우라 실패
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009; //분배법칙
        }

        for (int j=0; j<N; j++){
            int k = in.nextInt();
            System.out.println(dp[k]);
        }

    }
}
