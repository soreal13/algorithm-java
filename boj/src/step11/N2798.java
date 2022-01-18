package step11;

import java.util.Scanner;


//블랙잭
public class N2798 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        // n개 중 3개의 합 경우의 수 nC3 = n(n-1)(n-2)/3*2*1 = n(n-1)(n-2)/6
        int answer = 0;

        // 이중 for문
        for(int i=0; i<N-2; i++) {

            for(int j=i+1; j<N-1; j++) {

                for(int k=j+1; k<N; k++) {

                    int temp = arr[i] + arr[j] + arr[k];

                    int diff = M-temp;

                    if (diff >=0 && diff < (M-answer)) answer = temp;
                }
            }
        }

        System.out.println(answer);

    }
}
