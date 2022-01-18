package step12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


// 정렬
// 참조 https://st-lab.tistory.com/105

public class N2750 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            sb.append(arr[i]);
            if(i != (n-1)) sb.append('\n');
        }

        System.out.println(sb);

        // BufferReader 사용 하는 경우
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//        int[] arr = new int[N];
//
//        for(int i=0; i<N; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//
//        for(int val : arr) {
//            sb.append(val).append('\n');
//        }
//        System.out.println(sb);

    }

    // 버블 정렬 O(n^2)
    void bubbleSort() {
//        int[] arr;
//
//        for(int i=0; i < arr.length-1; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
    }

    //카운팅 정렬 O(n) = 계수 정렬
    //https://st-lab.tistory.com/104


}
