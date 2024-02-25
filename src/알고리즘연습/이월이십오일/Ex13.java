package 알고리즘연습.이월이십오일;

// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

public class Ex13 {
    public int solution(int n) {
        String numberStr = String.valueOf(n);

        int sum = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }
        return sum;
    }
}
