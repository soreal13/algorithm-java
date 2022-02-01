package bojstep.step12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 좌표 압축
// 랭크매기기에 가깝다
public class N18870 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        int[] sorted = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sorted[i] = in.nextInt();
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

        // 정렬 된 배열을 순회하며 맵에 넣는다
        int rank = 0;
        for (int v : sorted) {
            if(!rankMap.containsKey(v)) {
                rankMap.put(v, rank);
                rank++;
            }
        }


        StringBuilder sb = new StringBuilder();

        for(int key : arr) {
            int ranking = rankMap.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);

    }


    // 시간 초과 나옴 ㅜㅜ
    void solution1() {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = in.nextInt();
        }

        // 중복 제거 방법이 포인트
        for(int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int p = 0;
                    for (int k=0; k<j; k++) {
                        if (arr[j][0] == arr[k][0]) {
                            p--;
                        }
                        p++;
                    }
                    if (p==j) {
                        arr[i][1]++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            sb.append(arr[i][1]).append(" ");
        }

        System.out.println(sb);
    }


}
