/**
 * 순위 알고리즘 RankAlgorithm
 * 주어진 데이터의 순위를 구하기
 */
public class RankAlgorithm {

    public static void main(String[] args) {
        //input
        int [] scores = {100, 80, 70, 60, 90};
        int [] rankings = new int[5]; //5개의 공간을 미리 할당

        //process
        for (int i = 0; i < scores.length; i++) {
            rankings[i] = 1; //순위 배열을 매 회전마다 1로 초기화
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) { //scores에서 현재 i번째보다 j번째가 큰경우 +1
                    rankings[i]++;
                }
            }
            
        }
        //output
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "점은" + rankings[i] + "등입니다.");
            
        }
    }
}