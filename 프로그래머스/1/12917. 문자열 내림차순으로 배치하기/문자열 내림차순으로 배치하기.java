import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        
        StringBuilder answer = new StringBuilder(new String(array));
        return answer.reverse().toString();
    }
}