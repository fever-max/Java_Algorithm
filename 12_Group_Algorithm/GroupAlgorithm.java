/**
 * 그룹 알고리즘 Group Algorithm
 * 컬렉션 형태의 데이터를 특정 키 값으로 그룹화
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GroupAlgorithm {
    //테스트용 레코드 클래스
    public static class Record {
        private final String name;
        private final int quantity;
        public Record(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
        public String getName() {
            return name;
        }
        public int getQuantity() {
            return quantity;
        }
    }
    public static List<Record> getAll() { //데이터 채우기용 함수
        return Arrays.asList(
            new Record("RADIO", 3),
            new Record("TV", 1),
            new Record("RADIO", 2),
            new Record("DVD", 4)
        );
    }

    public static void printData(String message, List<Record> data) { //데이터 출력용 함수
        System.out.println(message);
        for (Record item : data) {
            System.out.println(String.format("%5s - %d", item.getName(), item.getQuantity()));
        }
    }

    public static void main(String[] args) {
        //input
        List<Record> records = getAll(); //입력 데이터
        List<Record> groups = new ArrayList<Record>(); //출력 데이터
        int N = records.size();
        //process
        for (int i = 0; i < N - 1; i++) { //그룹 정렬
            for (int j = i + 1; j < N; j++) {
                if (records.get(i).getName().compareTo(records.get(j).getName()) > 0) {
                    Record t = records.get(i); 
                    records.set(i, records.get(j)); 
                    records.set(j, t);
                }
            }
        }
        int subtotal = 0; //소계
        for (int i = 0; i < N; i++) {
            subtotal += records.get(i).getQuantity(); // 같은 상품명의 판매량을 누적(SUM)
            if ((i + 1) == N || // 단락(short circuiting)이면 아래 조건 무시 
                (records.get(i).getName() != records.get(i + 1).getName())) {
                //다음 레코드가 없거나, 현재 레코드와 다음 레코드가 다르면 저장
                Record r = new Record(records.get(i).getName(), subtotal);
                groups.add(r); // 하나의 그룹 저장
                subtotal = 0; // 하나의 그룹이 완료되면 소계 초기화
            }
        }


        //output
        printData("정렬된 원본 데이터:", records);
        printData("이름으로 그룹화된 데이터:", groups);
    }
}