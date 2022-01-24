package codeplus_51.bruteforce.NM;


import java.util.Scanner;

// N과 M (1)
// 백트래킹 https://st-lab.tistory.com/114
public class N15649 {


    // tip!! 재귀 호출시 depth를 같이 넘겨준다!!
    // dfs 함수에는 N과 M을 변수로 받고 depth 변수를 추가한다.


    // 문제 예제 잘 읽자... (1,2)와 (2,1) 같이 출력하래.... 하......
    // 아니 문제 서술이 이상하잖아 중복없이 M개를 고른다며 ㅡㅡ 예제만 그렇게 해놓는다고 저게 맞는 말이 되는게 아니잖아 아 개빡침
    // 하 그래 수열이니까.. 수열이니까...

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();	// 정적타입으로 해주어야한다.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);

        // 마지막에 한 번에 출력
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }

}
