package work;
//There is an array with some numbers. All numbers are equal except for one. Try to find it!
public class Equality_Checker {
    public static void main(String[] args) {
        int[] arr = {6,4,4,4,4,4,4};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] != 0) {
                    num = arr[i];
                break;}
            }
        }
        System.out.println("non-equal number is:" + num);
    }
}
