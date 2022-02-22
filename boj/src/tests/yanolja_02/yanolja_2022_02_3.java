package tests.yanolja_02;

import java.io.IOException;
import java.util.Arrays;
public class yanolja_2022_02_3 {

    public static void main(String[] args) throws IOException, NumberFormatException {
        int[] a = {4,4,7,1,2};
        int[] b = {4,4,8,1,2};

        num2(a,b);
    }

    public static void num2(int[] aa, int[] bb) {
        double[] result = new double[aa.length];
        for (int a = 0; a < aa.length; a++) {
            result[a] = (double) aa[a]/bb[a];
        }

        int[] dupli = new int[aa.length - 1];
        Arrays.fill(dupli, 1);
        for (int i = 0; i < dupli.length; i++) {
            int temp = 1;
            for (int j = (i+1); j < result.length; j++) {
                if (result[i] == result[j]) {
                    temp++;
                    dupli[i] = temp;
                }
            }
        }
        System.out.println(Arrays.stream(dupli).max().getAsInt());
    }
}
