package codeplus_51.bruteforce.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//다음 순열
// 앞에서부터 순서대로 찍어가면서 맞으면 그 다음거 출력하고 끝낸다
//https://pangtrue.tistory.com/327
public class N10972 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    }

    static boolean nextPermutation() {

        // 내림차순인지를 검색
        int i = nums.length - 1;
        while (i>0 && nums[i-1]>=nums[i]) {
            i--;
        }
        if (i<=0) return false;

        //
        int j = nums.length - 1;
        while (nums[j] <= nums[i-1]) {
            j--;
        }

        swap(i-1, j);

        return true;
    }

    static void swap(int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }


}
