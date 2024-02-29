package 알고리즘연습.이월이십구일;

// 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
public class Ex33 {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII 문자에 대한 중복 여부를 확인하기 위한 배열

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            if (!seen[currentChar]) {
                result.append(currentChar);
                seen[currentChar] = true;
            }
        }

        return result.toString();
    }
}
