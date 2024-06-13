package 알고리즘연습.육월십이일;

// 총 n장의 카드덱을 가지고 있습니다. 이 카드들은 가장 작은 숫자부터 가장 큰 숫자까지 순서대로 정렬되어 있습니다. 카드를 뽑는 규칙은 다음과 같습니다.
//
//맨 위의 카드를 뽑아 버립니다.
//
//그 다음 카드를 뽑아서 카드덱의 맨 뒤로 보냅니다.
//
//위의 두 과정을 반복합니다.
//
//이 규칙에 따라 카드를 뽑다 보면, 마지막에는 딱 한 장의 카드만 남게 됩니다. 이때, 마지막에 남는 카드의 숫자는 무엇일까요?

import java.util.LinkedList;
import java.util.Queue;

public class Ex52 {
    public static int findLastCard(int n) {
        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지의 카드를 큐에 넣는다.
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 큐에 카드가 한 장 남을 때까지 반복한다.
        while (queue.size() > 1) {
            // 첫 번째 카드를 제거한다.
            queue.poll();
            // 두 번째 카드를 큐의 뒤로 보낸다.
            queue.add(queue.poll());
        }

        // 마지막으로 남은 카드 반환
        return queue.peek();
    }

    public static void main(String[] args) {
        int n = 58 ; // 카드의 개수
        int lastCard = findLastCard(n);
        System.out.println("마지막에 남는 카드: " + lastCard);
    }
}

