package bojstep.step12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 단어 정렬
public class N1181 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        in.nextLine(); // 개행 한번 버림

        // nextLine() 아닌 next()로 받아줘야 arr[0]에 "" 이 안 담김.
        // nextLine은 개행문자, next는 띄어쓰기 (다음 토큰?)

        //콘솔창에서도 실행해보면 알겠지만, nextInt() 로 정수를 입력받은 뒤,
        // nextLine() 을 쓰면 입력한 첫 번째 문자가 arr[0] 에 입력되는 것이 아니라
        // 개행("\n")이 arr[0] 에 저장된다.
        // 이는 next 계열 입력을 받은 뒤, nextLine() 을 쓰면
        // 두 메소드의 메커니즘이 달라 발생하는 대표적인 에러다.
        // 그러니 이 점 유의하여 입력되는 개행을 한 번 버려야
        // 정상적으로 입력한 문자열을 배열에 저장할 수 있다.

        String[] arr = new String[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextLine();
        }

//        String[][] arr2 = new String[N][2];
//        in.nextLine(); // 개행 한 번 버림
//        int i = 0;
//        while(in.hasNext()) {
//            arr2[i][0] = in.nextLine();
//            arr2[i][1] = String.valueOf(arr2[i][0].length());
//            i++;
//        }


        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어 길이 같을 때
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(arr[0]);

        for(int i=1; i<N; i++){
            //중복되지 않을 때 출력
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
