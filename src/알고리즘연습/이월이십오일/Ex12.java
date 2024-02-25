package 알고리즘연습.이월이십오일;

// 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

public class Ex12 {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        String [] words = my_string.split("");
        for (String word : words) {
            for (int i = 0; i < n; i ++) {
                answer.append(word);
            }
        }
        return answer.toString();
    }
}
