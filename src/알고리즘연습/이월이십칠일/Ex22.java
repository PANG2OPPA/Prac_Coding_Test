package 알고리즘연습.이월이십칠일;
import java.util.ArrayList;
import java.util.Arrays;

// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
public class Ex22 {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE; // 첫 번째 최댓값
        int max2 = Integer.MIN_VALUE; // 두 번째 최댓값
        int min1 = Integer.MAX_VALUE; // 첫 번째 최솟값
        int min2 = Integer.MAX_VALUE; // 두 번째 최솟값

        // 최댓값과 최솟값 찾기
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // 두 최댓값 중 최댓값, 두 최솟값 중 최댓값을 곱하여 반환
        return Math.max(max1 * max2, min1 * min2);
    }
}
