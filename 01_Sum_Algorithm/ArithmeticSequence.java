/**
 * 등차수열 Arithmetic Sequence
 * 20이하 홀수의 합 구하기
 */
public class ArithmeticSequence {
    public static void main(String[] args) {
        //input
        int sum = 0; 
        //process
        for (int i = 1; i <= 20; i++) {
            if (!(i % 2 == 0)){
            sum += i;
            System.out.print(i + " ");
            }
        }
        //output
        System.out.println("\n1부터 20까지 홀수의 합: " + sum);
    }
}
