package tests.sampyo_03;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {


        // 비교할 List 준비
        int[] list1 = {1, 2, 2, 3, 3, 3};
        int[] list2 = {2, 3, 3, 4, 5};

        Arrays.sort(list1);
        Arrays.sort(list2);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i=0; i<list1.length; i++) {
            for(int j=0; j<list2.length; j++) {
                if (list1[i] < list2[j]) {
                    break;
                } else{
                    if (list1[i] == list2[j]) {
                        arrayList.add(list1[i]);
                        list1[i] = -1;
                        list2[j] = -1;
                        break;
                     }
                }
            }
        }

        System.out.println(arrayList);


    }

}
