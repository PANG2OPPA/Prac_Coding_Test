package 알고리즘연습.이월이십팔일;

// 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

public class Ex25 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n+1, my_string.length()-1);
    }
}
