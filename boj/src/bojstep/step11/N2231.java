package bojstep.step11;

import java.util.Scanner;

// 분해합
public class N2231 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0; i<=n; i++) {
            int sum = i + recursion(0, i);
            if (sum == n) {
                System.out.println(i);
                break;
            }
            if (i == n){
                System.out.println("0");
            }
        }
    }

    static int recursion(int sum, int i) {
        if (i == 0) {
            return sum;
        }
        sum += i % 10;
        i = i / 10;
        return  recursion(sum, i);
    }

}
