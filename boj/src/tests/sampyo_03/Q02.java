package tests.sampyo_03;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int road = 10;
        int[] roadArray = {2,5};

        int distance= roadArray[0];

        // 처음과 끝 거리
        if(roadArray[0] <= road - roadArray[roadArray.length-1]) {
          distance =  road - roadArray[roadArray.length-1];
        }

        boolean flag = false;
        for (int i=1; i<roadArray.length; i++) {
            int temp = roadArray[i] - roadArray[i-1];
            if (temp > distance) {
                distance = temp;
                flag = true;
            }
        }
        double answer = 0;
        if (flag) {
            answer = distance/2;
        } else {
            answer = distance;
        }
        System.out.println(answer);

    }
}
