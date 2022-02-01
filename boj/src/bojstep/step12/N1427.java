package bojstep.step12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class N1427 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //정렬 넣기

        String n = in.next();
        Integer[] arr = new Integer[n.length()];

        for(int i=0; i<n.length(); i++) {
            arr[i] = Integer.parseInt(n.substring(i, i+1));
        }


        //경우에 따라서 기본형 타입을 객체로 사용하는 경우가 있으며, 이러현 강우 기본형 타입 값을 객체로 표현해야합니다.
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}
