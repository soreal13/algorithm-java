package codeplus_51.graphBFS.queue;

import java.util.ArrayList;
import java.util.Scanner;

// 큐
public class N10845 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            String command = in.next();
            int k;
            switch (command) {
                case "push":
                    k = in.nextInt();
                    arrayList.add(k);
                    break;
                case "pop":
                    if (!arrayList.isEmpty()){
                        sb.append(arrayList.get(0)).append("\n");
                        arrayList.remove(0);
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case "size":
                    sb.append(arrayList.size()).append("\n");
                    break;
                case "empty":
                    if (arrayList.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "front":
                    if (arrayList.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(arrayList.get(0)).append("\n");
                    }
                    break;
                case "back":
                    if (arrayList.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(arrayList.get(arrayList.size()-1)).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
