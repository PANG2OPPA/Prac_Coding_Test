import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
public int[] solution(int[] arr) {
    if (arr.length == 1) {
        return new int[]{-1};
    }

    int min = Arrays.stream(arr).min().getAsInt(); 

    ArrayList<Integer> list = new ArrayList<>();
    for (int num : arr) {
        if (num != min) {
            list.add(num);  
        }
    }

    return list.stream().mapToInt(i -> i).toArray();
}
}