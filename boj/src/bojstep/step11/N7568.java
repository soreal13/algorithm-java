package bojstep.step11;

import java.util.Scanner;

// 7568. 덩치
//초등학교 올림피아드 뭐임 ^^ 짱나네
public class N7568 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][]arr = new int[n][4];

        // 값 받는다
        for(int i=0; i<n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // 본인보다 큰 덩치 개수 찾는다
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if((arr[i][0]<arr[j][0]) && arr[i][1]<arr[j][1]) {
                    arr[i][2]++;
                }
            }
        }

        // 본인보다 큰 덩치개수 0부터 찾아서 등수 매긴다.
        int count=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (arr[j][2] == count) {
                    arr[j][3] = count+1;
                }
            }
            count++;
        }

        // 출력한다
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            sb.append(arr[i][3]);
            sb.append(" ");
        }

        System.out.println(sb);

    }


}
