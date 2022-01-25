package bojstep.step11;

import java.util.ArrayList;
import java.util.Scanner;

// 영화감독 숌
public class N1436 {

    // 666 1666 2666 3666 4666 5666 6660 6661 ..... 6669 7666 8666 9666
    // 10666 11666 12666 13666 14666 15666 16661 .... 16669 17666 18666 19666
    // 20666 21666 22666 23666 24666 25666 26661 .... 26669 27666 27666 29666
    // ..
    // 60666 61666 62666 63666 64666 65666 66600 66601 66602 66603 66604... 66699 ..
    // 67666 ...69666

    // 영화 이름을 꼭 그렇게 지어야만 했니..
    public static void main(String[] args) {

        // 666 = x
        // x
        // 1x 2x 3x 4x 5x x0 x2 x4 ...x9 7x 8x 9x
        // 10x 11x .... x00 x02 ..x99 67x 68x ,,, 99x
        // 100x ... 665x x000 x001 ... x999 667x 668x ... 999x

        // 1 =1
        // 5 + 10 + 3 =18
        // 65 + 100 + 33 =198
        // 665 + 1000 + 333 =1998
        // 6665 +10000


    }

    static void solution2() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int num = 666;
        int count = 1;

        while(count != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }

    //메모리 초과
    static void solution1(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //1부터 검사하면서 666 인덱스가 있으면 arr에 넣는걸로
        for (int i=1; i<=66699999; i++) {
            String x = ""+i;
            if (x.contains("666")) {
                arrayList.add(Integer.parseInt(x));
            }
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(arrayList.get(num - 1));
    }

}
