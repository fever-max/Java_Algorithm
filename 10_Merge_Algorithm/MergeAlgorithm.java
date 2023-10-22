/**
 * 병합 알고리즘 Merge Algorithm
 * 2개의 정수 배열 합치기, 단 2개의 배열은 오름차순으로 정렬되어있음
 */
public class MergeAlgorithm {

    public static void main(String[] args) {
        //input
        int[] data1 = {1, 3, 5};
        int[] data2 = {2, 4};
        int M = data1.length; int N = data2.length;
        int[] merge = new int[M+N]; //두 배열의 길이의 합
        int i = 0; int j = 0; int k = 0;
        //process
        while (i < M && j < N) {
            if(data1[i] < data2[j]){
                merge[k++] = data1[i++];
            }
            else {
                merge[k++] = data2[j++];
            }
        }
        while (i < M) {
            merge[k++] = data1[i++];
        }
        while (j < N) {
            merge[k++] = data2[j++];
        }
        //output
        for (int a = 0; a < M+N; a++) {
            System.out.print(merge[a] + " ");
        }

        System.out.println();
    }
}