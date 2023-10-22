/**
 * 최빈값 알고리즘 Mode Algorithm
 * 주어진 데이터에서 가장 많이 나타난 값을 구하기
 */
public class ModeAlgorithm {

    public static void main(String[] args) {
        //input
        int [] scores = { 1, 3, 4, 3, 5};
        int [] index = new int[scores.length+1];
        int mode = 0;
        int max = Integer.MIN_VALUE; // 가장 작은 수로 초기화, 최빈값 카운트

        //process
        for (int i = 0; i < scores.length; i++) {
            index[scores[i]]++; //index 위치에서 ++로 카운트
        }
        for (int j = 0; j < index.length; j++) {
            if (index[j] > max) {
                max = index[j];
                mode = j;
            }
        }
        //output
        System.out.println("최빈값은 " + mode + "입니다. " + max + "번 반복됩니다.");
    }
}