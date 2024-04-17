import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 4, 5, 10, 199, 11, 9, 1, 11};
        int[] result = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int lengthOfMassive = numbers.length;
        int lengthOfNewMassive = 2;
        if (lengthOfMassive % 2 == 1) {
            lengthOfNewMassive = 1;
        }
        int[] result = new int[lengthOfNewMassive];
        System.arraycopy(numbers, (lengthOfMassive -1)/2, result, 0, lengthOfNewMassive);
        return result;
    }
}
