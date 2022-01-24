package bojstep.step11;

import java.util.Scanner;

// 체스판 다시 칠하기
// 포인트1.  String, char 받고 변환하기
// Character.toString
public class N1018 {

    public static String[][] board;
    public static int min = 64;

    public static void main(String[] args) {

        // 1. 입력 받음
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 세로
        int M = in.nextInt(); // 가로

        board = new String[N][M];

        for(int i=0; i<N; i++) {
            String str = in.next();
            for(int j=0; j<M; j++) {
                board[i][j] = str.substring(j,j+1);
            }
        }


        // 2. 가능성 있는 8x8 을 찾음 (최소)
        // -> 흰색도 다시 칠할 수 있다고 이해해야 함...ㅡㅡ
        // * 경우의 수는 (가로 칸 개수 - 7) × (세로 칸 개수 - 7)

        int N_row = N - 7;
        int M_col = M - 7;

        for(int i=0; i<N_row; i++) {
            for (int j=0; j<M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        String BW = board[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (!board[i][j].equals(BW)) {
                    count++;
                }
                // 스위치 해주기
                if (BW.equals("B")) {
                    BW = "W";
                } else {
                    BW = "B";
                }
            }
            // 스위치 해주기
            if (BW.equals("B")) {
                BW = "W";
            } else {
                BW = "B";
            }
        }

        // 첫번째 칸 흰,블 에 따라 칠할 갯수 중 작은 것 선택
        count = Math.min(count, 64 - count);

        // 전체 경우의 수 중 제일 작은 카운트를 전역에 갱신
        min = Math.min(min, count);
    }

}