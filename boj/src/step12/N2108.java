package step12;

import java.util.*;

// 통계학
public class N2108 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        int average = 0;
        int[] mode = new int[8001];

        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
            average += arr[i];
            mode[(arr[i] + 4000)]++;
        }

        Arrays.sort(arr);

        // 산술평균
        average = (int)Math.round((double)average / N);

        // 중앙값
        int mid = 0;
        if (arr.length == 1) {
            mid = arr[0];
        } else {
            mid = arr[(N/2)]; //나누기 몫 +1 이지만 결국 배열은 0부터 시작하므로 다시 -1 해줌

        }

        // 범위값
        int range = 0;
        if( arr.length != 1) {
            range = arr[N-1] - arr[0];
        }

        // 최빈값
        int max = 0;
        for(int i=0; i<mode.length; i++) {
            if (max < mode[i]) {
                max = mode[i];
            }
        }


        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0; i<mode.length; i++) {
            if (mode[i] == max) {
                arrayList.add(i);
            }
        }

        Collections.sort(arrayList);

        int[] modeArray = new int[arrayList.size()];
        int idx = 0;
        for(int i : arrayList) {
            modeArray[idx++] = i;
        }

        int modeNum=0;
        if(arrayList.size() == 1) {
            modeNum = modeArray[0];
        } else {
            modeNum = modeArray[1];
        }


        System.out.println(average);
        System.out.println(mid);
        System.out.println(modeNum-4000);
        System.out.println(range);

    }

}
