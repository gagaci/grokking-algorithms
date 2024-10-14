import java.util.Arrays;

public class SumOfArray {

  public static void main(String[] args) {
    int[] array = {2, 5, 4, 4};
    System.out.println(sumOfArray(array));
    System.out.println(countOfArray(array));
  }

  static int sumOfArray(int[] arr) {
    if (arr.length == 1) {
      return arr[0];
    }
    int[] subArr = Arrays.copyOfRange(arr, 1, arr.length);
    return arr[0] + sumOfArray(subArr);
  }

  static int countOfArray(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int[] subArray = new int[arr.length - 1];
    System.arraycopy(arr, 1, subArray, 0, subArray.length);
    return 1 + countOfArray(subArray);
  }
}
