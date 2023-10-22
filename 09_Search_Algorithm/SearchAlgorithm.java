/**
 * 검색 알고리즘 Search Algorithm
 * 정렬된 데이터를 이진검색을 활용하여 검색
 */
public class SearchAlgorithm {

    public static void main(String[] args) {
        //input
        int [] data = {1, 3, 5, 7, 9};
        int N = data.length;
        int search = 3;
        boolean flag = false; //찾으면 trre 그렇지 않으면 false
        int index = -1; //배열에서 찾은 위치 (인덱스)

        //process
        int low = 0; // 낮은 인덱스
        int high = N - 1; // 높은 인덱스
        while (low <= high) {
            int mid = (low + high) / 2; // 중간 인덱스 구하기
            if (data[mid] == search) {
                flag = true;
                index = mid;
                break;
            } else if (data[mid] < search) {
                low = mid + 1; // 중간 값보다 큰 부분 검색
            } else {
                high = mid - 1; // 중간 값보다 작은 부분 검색
            }
        }
        //output
        if (flag) {
            System.out.println(search + "를" + index + "위치에서 찾았습니다.");
        }
        else{
            System.out.println("찾지 못했습니다.");
        }

    }
}