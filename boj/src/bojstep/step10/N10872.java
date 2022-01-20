package bojstep.step10;

import java.util.Scanner;

// 팩토리얼 재귀
public class N10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
