package bojstep.step12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 기본기 문제임 https://st-lab.tistory.com/110 람다식
// 좌표 정렬
public class N11650 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]) { // 첫 번째 원소가 같다면 두 번째 원소끼리 비교
//                    return o1[1] - o2[1];
//                } else {
//                    return o1[0] - o2[0];
//                }
//            }
//        });

        // 람다식 표현법
       Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
