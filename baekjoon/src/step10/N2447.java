package step10;

import java.util.Scanner;

// 재귀적 별 찍기
public class N2447 {
    // 블록의 가운데가 '공백' 이다.
    // 공백 구간은 공백으로 채우고 공백 아닌 구간은 재귀로 채운다.

    static char[][] arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        arr = new char[n][n];

        star(0,0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void star(int x, int y, int n, boolean blank) {
        // 공백일 경우
        if (blank) {
            for (int i=x; i<x+n; i++) {
                for (int j=y; j<y+n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 쪼갤 수 없는 칸
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        // n을 3으로 나눈 것이 한 블록의 사이즈다. (n=27일때 한 블록 9)
        int size = n / 3;
        int count = 0;
        for (int i=x; i<x+n; i+= size) {
            for (int j=y; j<y+n; j+= size) {
                count++;
                // 공백 칸
                star(i, j, size, count == 5);
            }
        }
    }

}
