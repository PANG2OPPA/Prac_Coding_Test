package 알고리즘연습.육월십사일;

// 숫자 2개 랜덤 출력

import java.util.Random;

public class Ex56 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // 예시 배열
        solution(arr);
    }
    static void solution(int[] arr) {
        Random random = new Random();

        // 배열의 길이 가져오기
        int length = arr.length;

        // 첫 번째 랜덤 인덱스 생성
        int index1 = random.nextInt(length);

        // 두 번째 랜덤 인덱스 생성 (첫 번째 인덱스와 중복되지 않도록)
        int index2;
        do {
            index2 = random.nextInt(length);
        } while (index1 == index2);

        // 결과 출력
        System.out.println("Random numbers from array: " + arr[index1] + ", " + arr[index2]);
        System.out.println(length);
    }
}
