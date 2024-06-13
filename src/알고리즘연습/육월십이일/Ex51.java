package 알고리즘연습.육월십이일;

// 입력값으로 127.0.0.9 와 같은 ip주소가 주어졌다. 이때 .에 해당하는 부분을 [.]형태로 바꿔서 출력하라
public class Ex51 {
    public String solution(String n) {
        return n.replace(".", "[.]");
    }

    // 코드 테스트를 위한 부분
    public static void main(String[] args) {
        Ex51 ex51 = new Ex51();
        String ipAddress = "127.0.0.9";
        String result = ex51.solution(ipAddress);
        System.out.println("Original: " + ipAddress);
        System.out.println("Defanged: " + result);
    }
}
