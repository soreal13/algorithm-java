package bojstep.step10;

import java.util.Scanner;

// 하노이의 탑
// 참조 : https://ko.wikipedia.org/wiki/%ED%95%98%EB%85%B8%EC%9D%B4%EC%9D%98_%ED%83%91
// 참조2 : https://iseunghan.tistory.com/214
// 참조3 : https://shoark7.github.io/programming/algorithm/tower-of-hanoi

public class N11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // 옮긴 횟수
        System.out.println(hanoi(num));

        /**
         * 1단계 : 재귀 규칙 발견
        hanoi(N): N개의 원반을 다른 곳으로 옮겨라.
        hanoi(N-1): (N-1)개의 원반을 다른 곳으로 옮겨라.

        예를 들어 N=3 이라면
        2개가 미리 B에 꽃혀있고(hanoi(2)),
        큰걸 옮긴다음,
        다시 2개를 C로 옮긴다(hanoi(2)) */

        /** 2단계 경유지 개념 추가
         * 제일 큰 원반이 움직이는 것 빼고
         * 출발->도착 가려면 중간에 "경유지"에 들러야함
         */

        buildHanoi(num, 1, 2, 3);

        // 하노이의 탑 움직인 것
        System.out.println(sb);
    }

    /*
        n : 원판의 개수
        start : 시작 타워 번호
        mid : 옮기기 위해 중간에 이동하는 지점
        end : 도착지
     */

    static void buildHanoi(int n, int start, int mid, int end) {

        // 한 개일 경우 A->C 하나만 이동
        if (n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }
        // 1. N-1개를 A->B 로 이동
        buildHanoi(n-1, start, end, mid);

        // 2. 가장 큰 원반 1개를 A->C 이동
        sb.append(start + " " + end + "\n");

        // 3. N-1개 B->C 이동
        buildHanoi(n-1, mid, start, end);
    }

    // 하노이의 탑 공식 : 2^n - 1
    static int hanoi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return ((int)Math.pow(2, n) - 1);
        }
    }

}
