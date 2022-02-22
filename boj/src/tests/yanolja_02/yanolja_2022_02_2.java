package tests.yanolja_02;

import java.util.ArrayList;
import java.util.Arrays;

public class yanolja_2022_02_2 {

    public static void main(String[] args) {

        String n = "0081";
        int answer = solution(n);
        System.out.println(answer);

    }

    public static int solution(String s) {

        int[] array = new int[s.length()];
        for (int i=0; i< array.length; i++) {
            array[i] = Integer.parseInt(s.substring(i, i+1));
        }

        int count=0;
        ArrayList<Integer> intArr = new ArrayList<>();

        for (int i=0; i<array.length; i++) {
            int[] tempArray = Arrays.stream(array).toArray();
            for(int j=0; j<10; j++) {
                tempArray[i] = j;
                String tempString = "";
                for(int k=0; k<array.length; k++) {
                    tempString += tempArray[k];
                }
                int answer = Integer.parseInt(tempString);
                if(answer % 3 == 0 && !intArr.contains(answer)) {
                    intArr.add(answer);
                    count++;
                }
            }
        }

        return count;
    }
}