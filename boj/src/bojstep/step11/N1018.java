package bojstep.step11;

import java.util.Scanner;

// 체스판 다시 칠하기
// 포인트1.  String, char 받고 변환하기
// Character.toString
public class N1018 {

    public static void main(String[] args) {

        // 1. 입력 받음
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 세로
        int M = in.nextInt(); // 가로

        String[][] board = new String[N][M];

        for(int i=0; i<N; i++) {
            String str = in.next();
            for(int j=0; j<M; j++) {
                board[i][j] = Character.toString(str.charAt(j));
            }
        }


        for(int i=0; i<=N; i++) {
            for(int j=0; j<=M; j++) {
                System.out.println(board[i][j] +" ");
            }
        }


        // 2. 가능성 있는 8x8 을 찾음 (최소)
        // 가능성이 있다는 것 = 두개 연이어서 black 아님, 위 아래 black 아님.
        // 힌트? 체스판 색칠은 두 가지의 쁜. 맨 왼쪽 위 칸이 흰색 or 블랙
        // 첫칸 블랙이면 2의 배수칸, 2의 배수가 아닌칸, 2의 배수칸.. 블랙 있으면 안됨.
        // 첫칸 흰색이면 2의 배수가 아닌칸, 2의 배수칸, 2의 배수가 아닌칸 블랙 있으면 안됨.

//        if (int i=1)



        // 부족한 자리에 검은색 색칠 개수
    }


}

