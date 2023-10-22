/**
 * 최댓값 알고리즘 MaxAlgorithm
 * 주어진 데이터에서 가장 큰 데이터를 구하라.
 */
public class MaxAlgorithm {

    public static void main(String[] args) {
        //input
        int [] data = {1, 4, 5, 9, 15};
        int max = data[0]; // 또는 정수 형식 데이터에서 가장 작은 값으로 초기화 (integer.MIN_VALUE)
        //process
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data [i];
            }
        }
        //output
        System.out.println("최댓값: " + max);
    }
}