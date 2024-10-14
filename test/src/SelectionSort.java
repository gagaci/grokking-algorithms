public class SelectionSort {

    public static void main(String[] args) {
        greet("John");
        int fac = factorial(3);
        System.out.println(fac);
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void greet(String name) {
        System.out.println("hi ," + name + " !");
        greet2(name);
        bye();
    }

    private static void bye() {
        System.out.println("ok, bye");
    }

    private static void greet2(String name) {
        System.out.println("How are you " + name);
    }

    public static void countDown(int a) {
        System.out.println(a);
        if (a <= 0) {
            return;
        }
        countDown(a - 1);
    }

    public static int findSmallest(int[] arr) {
        var smallest = arr[0];
        var smallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
