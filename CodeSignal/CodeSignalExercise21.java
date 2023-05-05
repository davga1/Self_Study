package CodeSignal;

public class CodeSignalExercise21 {
    public static void main(String[] args) {
        System.out.println(solution("1.1.1.1a"));
    }
   static boolean solution(String inputString) {
        String[] arr = inputString.split("\\.");
        if (inputString.matches("[0-9 .]+")){
        if (arr.length != 4)return false;
       for (String x:arr){
           if (x.isEmpty())return false;
           if (Integer.parseInt(x) < 0 || Integer.parseInt(x)> 255)return false;
       }
       return true;
   }
        return false;
   }
}
