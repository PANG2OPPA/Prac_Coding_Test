package 알고리즘연습.육월십이일;

public class Ex54 {

    public static void main(String[] args) {
        int s = 4; // s 값 설정

        // solution 메서드 호출
        solution();
    }
    static void solution() {
        for (int i = 1; i < 10; i++) {
            for (int I = 1; I < 10; I++) {
                System.out.println(I + "*" + i + "=" + I * i + "입니다.");
            }
        }
    }
}
