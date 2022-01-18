package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 골드바흐의 추측
public class N9020 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {

        System.out.println(prime[0]);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();

        int t = Integer.parseInt(br.readLine());

        while (t-- >0) { // 루프가 돌 때마다 T가 1씩 줄게 되고 준 값이 0보다 클 경우에만 돌게 됨.
            int n = Integer.parseInt(br.readLine());
            int partition_one = n / 2;
            int partition_two = n / 2;

            while(true) {

                //두 파티션 모두 소수인 경우
                if (!prime[partition_one] && !prime[partition_two]) {
                    sb.append(partition_one).append(' ').append(partition_two).append('\n');
                    break;
                }

                // 더하면 n이므로 하나는 줄고 하나는 늘어서 합이 n 유지된다.
                partition_one--;
                partition_two++;

            }
        }
        System.out.println(sb);
    }

    // 에라토스테네스의 체
    public static void getPrime() {
        //0과 1은 소수가 아님
        prime[0] = true;
        prime[1] = true;

        // 제곱근까지만 확인하면 됨
        for (int i=0; i<Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;

            // i이전의 자연수 n들은 이미 걸려졌으므로 i*i 부터 시작
            // j에서 i씩 간격으로 체크
            for (int j=i*i; j< prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}
