class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];  // n의 크기로 배열을 초기화합니다.
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);  // x의 배수를 계산하여 배열에 넣습니다.
        }
        return answer;
    }
}
