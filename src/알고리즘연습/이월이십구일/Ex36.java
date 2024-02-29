package 알고리즘연습.이월이십구일;


import java.util.ArrayList;
import java.util.Arrays;

// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Ex36 {
    public ArrayList<Integer> solution(int[] num_list) {
        Arrays.sort(num_list);
        ArrayList<Integer>answer = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            answer.add(num_list[i]);
        }

        return answer;
    }
}
