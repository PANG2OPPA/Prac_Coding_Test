package 알고리즘연습.이월이십육일;

// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
public class Ex18 {
    public int solution(String my_string) {
        int answer = 0;
        String my = my_string.replaceAll("[a-zA-Z]", "");

        for (int i = 0; i < my.length(); i++) {
            char digitChar = my.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            answer += digit;
        }
        return answer;
    }
}
