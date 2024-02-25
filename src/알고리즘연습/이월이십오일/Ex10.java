package 알고리즘연습.이월이십오일;

import java.util.ArrayList;

// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

public class Ex10 {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 1부터 n까지의 홀수를 찾아서 answer에 추가
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer.add(i);
            }
        }

        return answer;
    }
}
