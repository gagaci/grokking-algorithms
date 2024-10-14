public class isPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(131));
  }

  public static boolean isPalindrome(int number) {
    int originalNumber = number;
    int reversedNumber = 0;
    while (number != 0) {
      int lastDigit = number % 10;
      reversedNumber = reversedNumber * 10 + lastDigit;
      number = number / 10;
    }
    return originalNumber == reversedNumber;
  }
}