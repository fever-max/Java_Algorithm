/**
 * 합계 알고리즘 Sum Algorithm
 */
public class SumAlgorithm {

    public static void main(String[] args) {
        //input: n명의 국어 점수
        int[] scores ={100, 70, 30, 80, 90, 95};
        int sum = 0;

        //process
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                sum += scores[i]; //SUM 누적
            }
        }

        //output
        System.out.println(scores.length + "명의 점수 중 80점 이상의 합계는? " + sum);
    }
}