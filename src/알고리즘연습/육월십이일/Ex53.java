package 알고리즘연습.육월십이일;

// 4개의 주사위를 가지고 있는 상금 게임에 참가했습니다. 각 주사위는 1부터 6까지의 숫자를 가지고 있습니다. 주사위를 던져서 나오는 결과에 따라 다음과 같이 상금이 결정됩니다.
//
//같은 숫자가 4개 나온 경우: 10000원 + (해당 숫자 * 1000)
//
//같은 숫자가 3개 나온 경우: 1000원 + (해당 숫자 * 100)
//
//같은 숫자가 2개 나온 경우: 100원 + (해당 숫자 * 10)
//
//모든 숫자가 다른 경우: 가장 큰 숫자 * 10원
//
//당신이 주사위를 던져 나온 숫자들을 입력 받아, 이 게임에서 얻을 수 있는 상금을 계산하는 프로그램을 만드세요.

import java.util.Arrays;

public class Ex53 {

    public static void main(String[] args) {
        int[] dice = {3, 3, 3, 3}; // 예시: 주사위 숫자 배열

        int prize = calculatePrize(dice);
        System.out.println("상금: " + prize + "원");
    }

    public static int calculatePrize(int[] dice) {
        int[] counts = new int[7]; // 주사위 숫자 빈도를 저장할 배열 (인덱스 1부터 사용)

        // 각 숫자의 빈도 계산
        for (int num : dice) {
            counts[num]++;
        }

        int maxCount = 0; // 가장 많이 나온 숫자의 빈도
        int maxNumber = 0; // 가장 많이 나온 숫자

        // 빈도가 가장 높은 숫자 찾기
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxNumber = i;
            }
        }

        // 상금 계산
        int prize = 0;
        switch (maxCount) {
            case 4:
                prize = 10000 + (maxNumber * 1000);
                break;
            case 3:
                prize = 1000 + (maxNumber * 100);
                break;
            case 2:
                prize = 100 + (maxNumber * 10);
                break;
            case 1: // 모든 숫자가 다를 경우
                int maxValue = 0;
                for (int num : dice) {
                    if (num > maxValue) {
                        maxValue = num;
                    }
                }
                prize = maxValue * 10;
                break;
        }

        return prize;
    }
    }

