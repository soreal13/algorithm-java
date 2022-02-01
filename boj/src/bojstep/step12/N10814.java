package bojstep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

// 나이순 정렬
public class N10814 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = in.next();
            arr[i][1] = in.next();
//            in.nextLine();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }

    // 다른 방법
    // [String[][] + BufferedReader + StringBuilder]
    void solution1() throws IOException {
        // BufferedReader 는 한 줄을 읽기 때문에 문자열 분리가 필요한데,
        // 이는 StringTokenizer 를 사용하여 문자열을 분리

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

    }

    // [Person[] + Scanner + StringBuilder]
    void solution2() {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Person[] p = new Person[N];

        for(int i=0; i<N; i++) {
            p[i] = new Person(in.nextInt(), in.next());
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            sb.append(p[i]);
        }

        System.out.println(sb);


    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }

}
