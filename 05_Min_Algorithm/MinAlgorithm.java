/**
 * 최솟값 알고리즘 MinAlgorithm
 * 주어진 데이터에서 가장 작은 짝수의 값 구하기
 */
public class MinAlgorithm {

    public static void main(String[] args) {
        //input
        int [] data = {3, 4, -1, 2, 5, 10};
        int min = data[0]; // integer.MAN_VALUE를 사용하기도 함.
        //process
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min && data[i] % 2 == 0) {
                min = data[i];
            }
        }
        //output
        System.out.println("가장 작은 짝수의 값: " + min);
    }
}