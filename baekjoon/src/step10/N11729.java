package step10;

import java.util.Scanner;

// 하노이의 탑
// 참조 : https://ko.wikipedia.org/wiki/%ED%95%98%EB%85%B8%EC%9D%B4%EC%9D%98_%ED%83%91
// 참조2 : https://iseunghan.tistory.com/214
public class N11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // 옮긴 횟수
        System.out.println(hanoi(num));

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
