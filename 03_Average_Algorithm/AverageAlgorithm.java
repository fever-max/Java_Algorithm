/**
 * 평균 알고리즘 Average Algorithm
 * 80점 이상, 95점 이하의 점수의 평균은?
 */
public class AverageAlgorithm {

    public static void main(String[] args) {
        //input
        int[] data = {60, 70, 80, 85, 95, 96};
        int sum = 0;
        int count = 0;
        //process
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 80 && data[i] <= 95){
                sum += data[i];
                count++;
            }
        }
        double avg = sum / (double)count;
        //output
        System.out.println("80점 이상, 95점 이하 자료의 평균: " + avg);
    }
}