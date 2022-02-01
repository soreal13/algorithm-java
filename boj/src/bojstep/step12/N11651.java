package bojstep.step12;

import java.util.Arrays;
import java.util.Scanner;

public class N11651 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
           if (o1[1] == o2[1]) {
               return o1[0] - o2[0];
           } else {
               return o1[1] - o2[1];
           }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
