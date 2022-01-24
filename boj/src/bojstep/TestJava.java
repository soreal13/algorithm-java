package bojstep;

import java.io.BufferedReader;

public class TestJava {

    public static void main(String[] args) {

        String str = "BWWBWB";
        char[] charStr = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
            charStr[i] = str.charAt(i);
        }

        System.out.println("====================");

        for(int i=0; i< charStr.length; i++) {
            System.out.println(charStr[i]);
        }




//        String[][] arr = new String[3][4];
//
//        for (int i=0; i<3; i++) {
//            for(int j=0; j<4; j++) {
//                arr[i][j] = i + "," + j;
//            }
//        }
//
//        for (int i=0; i<3; i++) {
//            for(int j=0; j<4; j++) {
//                System.out.print("["+arr[i][j]+ "]");
//            }
//            System.out.println();
//        }

    }
}
