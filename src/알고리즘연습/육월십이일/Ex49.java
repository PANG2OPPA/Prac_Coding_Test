package 알고리즘연습.육월십이일;

// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

public class Ex49 {
    public int solution(int n) {
        int answer = 0;
        String N = Integer.toString(n);
        for (int i = 1; i <= N.length(); i++){
            answer += N.charAt(i) - '0';
        }
        return answer;
    }
}
