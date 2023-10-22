/**
 * 근삿값 알고리즘 Near Algorithm: 차잇값의 절댓값의 최솟값
 * 원본 데이터 중에서 대상 데이터와 가장 가까운 값을 구하라
 */
public class NearAlgorithm {
    public static int change(int data) {
        return (data < 0) ? -data : data; //음수일 경우 양수화
    }
    public static void main(String[] args) {
        //input
        int min = Integer.MAX_VALUE; //차잇값의 절댓값의 최솟값
        int near = 0;
        int [] data = {10, 20, 28, 17, 30};
        int target = 25; 
        //process
        for (int i = 0; i < data.length; i++) {
            int abs = change(data[i] - target);
            if (abs < min) {
                min = abs;
                near = data[i]; //근삿값
            }
        }
        //output
        System.out.println(target + "과 가장 가까운 값: " + near);
    }
}