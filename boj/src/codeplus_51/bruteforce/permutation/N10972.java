package codeplus_51.bruteforce.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//다음 순열
// 앞에서부터 순서대로 찍어가면서 맞으면 그 다음거 출력하고 끝낸다

// 사실 이해 못함 ㅡㅡ
//https://pangtrue.tistory.com/327
public class N10972 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        if (nextPermutation()) {
            for(int i=0; i<N; i++) {
                System.out.print(nums[i]+ " ");

            }
        } else {
            System.out.println("-1");
        }


    }

    static boolean nextPermutation() {

        // 내림차순인지를 검색, 내림차순 꺾이는 지점 찾기
        int i = nums.length - 1;
        while (i>0 && nums[i] <= nums[i-1]) {
            i--;
        }
        if (i<=0) return false;

        // swap할 숫자 찾는다. 바로 다음으로 큰 수
        // 뒤는 이미 내림차순 되어있으므로 차례로 검사하면 바로 다음으로 큰 수 찾을 수 있음.
        int j = nums.length - 1;
        while (nums[j] <= nums[i-1]) {
            j--;
        }

        swap(i-1, j);

        // 뒷부분 오름차순
        j = nums.length - 1;
        while (i<j) {
            swap(i, j);
            i++; j--;
        }

        return true;
    }

    static void swap(int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    // 해설
    // P = [4, 6, 5, 7, 3, 2, 1]
    // 7321만 보면 해당 수 조합에서 가장 큰 수 (내림차순 나열)
    // 즉 내림차순으로 그 다음 수 없으므로 처음으로 내림차순 꺾이는 5를 스왑
    // 5보다 큰 바로 다음 큰 수와 스왑
    // 467 5321 에서 5321를 오름차순으로 정렬


}
