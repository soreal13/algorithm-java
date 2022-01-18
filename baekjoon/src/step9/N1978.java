package step9;

import java.util.Scanner;


//소수찾기
public class N1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;

        for(int i=0; i<n; i++) {

            boolean isPrime = true;

            int num = in.nextInt();

            if (num == 1 ) { // 1은 제외
                continue;
            }
            for(int j=2; j<=Math.sqrt(num); j++){
                if (num % j == 0) {
                    isPrime = false; // 나눠지는 숫자가 있으면 소수가 아니다
                    break;
                }
            }
            if(isPrime) { //소수이면 카운트 셈
                count++;
            }
        }
        System.out.println(count);

    }

    //에라토스테네스의 체
    public boolean[] make_prime(int max) {
        boolean[] prime = new boolean[max+1];

        //0과 1은 소수가 아님
        prime[0] = true;
        prime[1] = true;

        for(int i=0; i<=Math.sqrt(max); i++) {
            //이미 걸러진 배열은 다음 반복문으로
            if(prime[i] = true) {
                continue;
            }

            //i이전의 자연수 n들은 이미 걸려졌으므로 i*i 부터 시작
            //j에서 i씩 간격으로 체크
            for(int j=i*i; j<max+1; j=j+i) {
                prime[j] = true;
            }
        }
        // 소수는 false, 아니면 true인 배열
        return prime;
    }
}
