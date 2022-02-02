package codeplus_51.bruteforce.bitmask;

// 집합

import java.util.*;

public class N11723 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();  // 연산 수
        Set<Integer> set = new HashSet<>(); // 중복 허용 X

        for (int i = 0; i < m; i++) {
            String cal = sc.next();
            int x = 0;

            switch (cal) {
                case "add":
                    x = sc.nextInt();
                    set.add(x);
                    break;
                case "remove":
                    x = sc.nextInt();
                    set.remove(x);
                    break;
                case "check":
                    x = sc.nextInt();
                    if (set.contains(x))
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "toggle":
                    x = sc.nextInt();
                    if (set.contains(x))
                        set.remove(x);
                    else
                        set.add(x);
                    break;
                case "all":
                    for (int k = 0; k < 20; k++) {
                        set.add(k + 1);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }


// 문제 걍 어셈블리어 아님?
    // 시간 초과 ㅜㅜ -> sout만 sb로 바꿔주니 통과
    void solution1 (){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Map<Integer, Boolean> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=20; i++) {
            map.put(i, false);
        }

        for (int i=0; i<N; i++) {
            String command = in.next();
            Integer num = 0;
            if (!command.equals("all") && !command.equals("empty")) {
                num = in.nextInt();
            }

            switch (command) {
                case "add" :
                    map.replace(num, true);
                    break;
                case "remove" :
                    map.replace(num, false);
                    break;
                case "check" :
                    if (map.get(num) == true) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle" :
                    if (map.get(num) == true) {
                        map.replace(num, false);
                    } else {
                        map.replace(num, true);
                    }
                    break;
                case "all" :
                    for (int j=1; j<=20; j++) {
                        map.replace(j, true);
                    }
                    break;
                case "empty" :
                    for (int j=1; j<=20; j++) {
                        map.replace(j, false);
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
