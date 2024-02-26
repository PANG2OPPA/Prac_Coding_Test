package 알고리즘연습.이월이십육일;

// 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;
import java.util.List;

public class Ex15 {
    public String solution(String my_string) {
        char[] charArray = my_string.toCharArray();
        String[] alpha = {"a", "e", "i", "o", "u"};
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        StringBuilder result = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder를 생성합니다.

        for (char ch : charArray) {
            char lowercaseCh = Character.toLowerCase(ch); // 문자를 소문자로 변환합니다.
            if (!vowels.contains(lowercaseCh)) {
                result.append(ch); // 모음이 아닌 경우에만 결과에 추가합니다.
            }
        }

        return result.toString(); // StringBuilder를 문자열로 변환하여 반환합니다.
    }
}

