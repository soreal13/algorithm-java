package codeplus_51.bruteforce.recursion;


import java.util.Scanner;

// 1,2,3 더하기
// 문제 제대로 읽어라 1,2,3만 가지고 더한다.....
// 동적계획법 dp
// 처음 진행되는 연산 기록하고 이미 진행했던 연산은 기록되어 있는 값을 가져온다.
public class N9095 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 4번째 부터 규칙이 보이는 점화식 ㅡㅡ 수능 3점 문제아님? 솔직히..

        // 1 = 1
        // 2 = 1+1, 2
        // 3 = 1+1+1, 1+2, 2+1, 3

        // 4 = 1+1+1+1, 1+1+2, 1+2+1, 1+3 (1+dp[3])
        //     2+1+1, 2+2 (2+dp[2])
        //     3+1 (3+dp[1])

        // 5 = 1+1+3, 1+1+1+2, 1+2+2, 1+1+1+1+1, 1+2+1+1, 3+1+1 (1+dp[4])
        //    2+1+1+1, 2+1+2, 2+2+1, 2+3 (2+dp[3])
        //    3+1+1, 3+2 (3+dp[2])
        // 숫자 4는 쓸 수 없음

        // 6 = (1+dp[5])
        //     (2+dp[4])
        //     (3+dp[3])
        // 숫자 4, 5는 쓸 수 없음

        // 7 = (1+dp[6])
        //     (2+dp[5])
        //     (3+dp[4])
        // 숫자 4,5,6 쓸 수 없음.

        // 점화식 유도 = dp[n] = dp[n-1] + dp[n-2] + dp[n-3] (단 n>=4)

        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i=4; i<11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }


        int n = in.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println(arr[in.nextInt()]);
        }
    }
}
