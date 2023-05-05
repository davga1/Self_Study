package CodeSignal;

import java.util.ArrayList;
import java.util.Comparator;

public class CodeSignalExercise22 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 9};
        System.out.println(solution(arr));
    }

    static int solution(int[] inputArray) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int x : inputArray) {
            a1.add(x);
        }
        a1.sort(Comparator.naturalOrder());
        int start = 0;
        int step = 1;
        for (int i = 0; i < a1.get(a1.size()-1); i++) {
            start += step;
            for (Integer integer : a1) {
                if (start == integer)
                    start = 0;
                step++;
            }
        }
        return step;
    }
}
