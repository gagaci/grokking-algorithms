import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {
  int[] arr = {3,2,4};
  int t = 6;
    int[] ints = twoSum(arr, t);
    System.out.println(Arrays.toString(ints));
  }



  static int[] twoSum(int[] arr, int target) {
    int[] newArr = new int[2];
    int size = arr.length;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] + arr[j] == target) {
          newArr[0] = i;
          newArr[1] = j;
        }
      }
    }
    return newArr;
  }
}
