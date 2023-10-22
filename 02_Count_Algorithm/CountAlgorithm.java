/**
 * 개수 알고리즘 Count Algorithm
 * n까지의 정수 중, 13의 배수의 개수
 */
public class CountAlgorithm {

    public static void main(String[] args) {
        //input
        int[] numbers = {11, 12, 13, 13, 15, 26};
        int count = 0;
        //process
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 13 == 0) {
                //count = count + 1
                //count += 1
                count++;
            }
        }
        //output
        System.out.println(numbers.length + "개의 정수 중 13의 배수는 " + count + "개 입니다.");
    }
}