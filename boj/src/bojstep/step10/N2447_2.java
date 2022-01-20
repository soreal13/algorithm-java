package bojstep.step10;

import java.util.Scanner;

public class N2447_2 {
    public static void star(int i, int j, int num) {
        if ( (i / num) % 3 == 1 && (j / num) % 3 == 1 ) {
            System.out.print(" ");
        } else {
            if (num / 3 == 0) {
                System.out.print("*");
            } else {
                star(i, j, num/3);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // N*N
        for (int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                star(i, j, num);
            }
            System.out.println("");
        }
    }

}
