package codeplus_51.math;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 약수의 합 2
public class N17427 {


    public static void main(String[] args) throws Exception {

//        long beforeTime = System.currentTimeMillis();
//
//        solution1();

//        long afterTime = System.currentTimeMillis();
//        long setDiff = (afterTime - beforeTime);
//        System.out.println(setDiff);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        long num = 0;

        // 수 나열하여 규칙 이해해야 함.
        for (int i=1; i<=A; i++) {
            num += (A/i) * i;
        }

        System.out.println(num);

    }

    // 시간 초과 이중 for문을 안돌리는게 핵심
    static void solution1 () {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();

        long beforeTime = System.currentTimeMillis();


//        Set<Integer> set = new HashSet<>();
//
//        // 약수 구하기
//        for(int i=1; i<A/2; i++) {
//            if (A%i == 0) set.add(i);
//        }
//
        long num=0;

        for(int i=1; i<=A; i++) {
            for(int j=1; j<=i/2; j++) {
                if ( i % j  == 0) num+= j;
            }
            num+=i;
        }

        long afterTime = System.currentTimeMillis();
        long setDiff = (afterTime - beforeTime);
        System.out.println(setDiff);
        System.out.println(num);
    }

    void solution2 () {
        // 다른사람 풀이 ?? 이중 포문 돌림
        long[] each = new long[1000001];
        long[] sum = new long[1000001];
        long max = 1000000;
        for(int i = 1 ; i <= max ; i++){
            for(int j = 1 ; i*j <= max ; j++){
                each[i*j]+=i;
            }
        }
        for(int i = 1 ; i <= max ; i++){
            sum[i] = sum[i-1] + each[i];
        }
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sum[N]);
    }
}
