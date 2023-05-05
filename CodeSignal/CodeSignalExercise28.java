package CodeSignal;

public class CodeSignalExercise28 {
    public static void main(String[] args) {
        System.out.println(solution("crazy"));
    }
  static  String solution(String inputString) {
        StringBuilder answer = new StringBuilder();
        char[] arr = inputString.toCharArray();
        for (int i = 0;i < arr.length;i++){
            answer.append((char)(arr[i] + 1));
        }
        String w = String.valueOf(answer);
        w = w.replace('{','a');
        return w;
    }
}
