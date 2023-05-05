package CodeSignal;

public class CodeSignalExercise26 {
    public static void main(String[] args) {
        System.out.println(solution(642386));
    }

    static boolean solution(int n) {
        boolean isEven = false;
        String w = String.valueOf(n);
        String[] arr = w.split("");
        for (String x : arr) {
            if (Integer.parseInt(x) % 2 == 0)
                isEven = true;
            else {
                isEven = false;
                break;
            }
        }
        return isEven;
    }
}
