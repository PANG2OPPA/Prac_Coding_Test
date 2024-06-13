package 알고리즘연습.육월십삼일;

// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Ex51 {
    public long solution(long n) {
        // long을 문자열로 변환
        String N = Long.toString(n);

        // 문자열을 문자 배열로 변환
        Character[] digits = new Character[N.length()];
        for (int i = 0; i < N.length(); i++) {
            digits[i] = N.charAt(i);
        }

        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(digits, Collections.reverseOrder());

        // 정렬된 문자를 다시 문자열로 변환
        StringBuilder sortedStr = new StringBuilder(digits.length);
        for (char digit : digits) {
            sortedStr.append(digit);
        }

        // 문자열을 long으로 변환
        return Long.parseLong(sortedStr.toString());
    }

}
