package tests.yanolja_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class yanolja_2022_02_4 {


    public static void main(String[] args) {

        int N = 4;
        int[] A = {2,2,1,2};
        int[] B = {1,3,4,4};

        solution(N, A, B);

    }

    public static int solution(int N, int[] A, int[] B) {
        int initSize = N;
        ListGraph adjList = new ListGraph(initSize);

        for(int i=0; i<A.length; i++) {
            adjList.put(A[i], B[i]);
        }

        int[][] arr = new int[N][3];
        for(int i=0; i<N; i++){
            arr[i][0] = i+1;
            arr[i][1] = adjList.getNode(i+1).size();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int k =1;
        for (int i=0; i< N; i++) {
            arr[i][2] = k;
            k++;
        }
        int answer = 0;

        for(int i=0; i<N; i++) {

            answer += (arr[i][1]) * arr[i][2];
        }

        return answer;
    }

}

class ListGraph {

    private ArrayList<ArrayList<Integer>> listGraph;

    // 그래프 초기화
    public ListGraph(int initSize) {
        this.listGraph = new ArrayList<ArrayList<Integer>>(); // 그래프 생성

        // 그래프 초기화
        // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
        // ArrayList의 index는 0 부터 시작이므로
        // ArrayIndexOutOfBoundsException 방지를 위해
        // 정점을 담는 인접리스트의 size는 1을 더하여 초기화해줌
        // ex) initSize = 3
        // graph[0]
        // graph[1] -> 2 -> 3
        // graph[2] -> 1 -> 3 -> 4
        // graph[3] -> 1 -> 2 -> 4 -> 5
        for(int i=0; i<initSize+1; i++) {
            listGraph.add(new ArrayList<Integer>());
        }
    }

    // 그래프의 특정 노드 return
    public ArrayList<Integer> getNode(int i) {
        return this.listGraph.get(i);
    }

    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }

}