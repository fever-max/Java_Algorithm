/**
 * 선택정렬 알고리즘 Sort Algorithm 
 * 무작위 데이터를 오름차순으로 정렬하기
 */
public class SortAlgorithm {

    public static void main(String[] args) {
        //input
        int[] data = {39, 12, 4, 40, 70};
        int N = data.length;
        //process
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i]; //swap 하는 형식
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        //output
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}