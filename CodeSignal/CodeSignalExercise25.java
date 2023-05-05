package CodeSignal;

import java.util.Arrays;

public class CodeSignalExercise25 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(solution(arr, 1, 3)));
    }
    static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
       int[] arr = new int[inputArray.length];
       for (int i = 0;i < arr.length;i++){
           if(inputArray[i] == elemToReplace)arr[i] = substitutionElem;
           else arr[i] = inputArray[i];
       }
        return arr;
    }
}
