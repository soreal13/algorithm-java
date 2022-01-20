package codeplus_51.math;


import java.util.Arrays;
import java.util.Scanner;

// 약수
public class N1037 {

    public static void main(String[] args) {

        // 그냥 가장 큰 약수 x 2 하면 되는거 아닌가 ---> 틀림!! 27을 생각하면 됨 홀수 케이스 3*9
        // 최소 최대 곱해야함
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n+1];

        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[1]*arr[n]);

    }
}
