package 알고리즘연습.이월이십칠일;

// 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
public class Ex23 {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer2 = 0;
        int answer = 0;
        for (int i = 0; i < num_list.length; i++ ) {
            answer1 *= num_list[i];
            answer2 += num_list[i];
        }
        if (answer1 < answer2*answer2) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
