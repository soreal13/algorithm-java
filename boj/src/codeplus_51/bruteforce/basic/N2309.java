package codeplus_51.bruteforce.basic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 일곱난쟁이
public class N2309 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList heightArray = new ArrayList<>();
        int total = 0;

        for (int i=0; i<9; i++){
            heightArray.add(in.nextInt());
            total += (int)heightArray.get(i);
        }

        int diff = total - 100;

        boolean flag = false;

        for (int i=0; i<=7; i++) {
            for (int j=i+1; j<=8; j++) {
                if ( ((int)heightArray.get(i) + (int)heightArray.get(j)) == diff) {
                   heightArray.remove(i); // 아 여기서 인덱스가 바뀌어 버리는 구나 그러나 i가 항상 j보다 먼저이므로
                   heightArray.remove(j-1);
                   flag = true;
                   break;
               }
            }
            if (flag) break;
        }

        Collections.sort(heightArray);

        for (int i=0; i<heightArray.size(); i++) {
            System.out.println(heightArray.get(i));
        }
    }

}
