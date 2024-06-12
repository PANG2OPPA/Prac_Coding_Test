package 알고리즘연습.육월십이일;

// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

public class Ex47 {
    public int solution(String s) {
        String S = "";

        int answer = 0;
        if (s.charAt(1) == '-') {
            s.substring(1);
            answer = 0 - Integer.parseInt(s);
        } else  {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}
