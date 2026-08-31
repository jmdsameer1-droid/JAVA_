public class reversestring {
    public static String reverseString(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int num = 12345;

        System.out.println("Reversed String: " + reverseString(str));
        System.out.println("Reversed Number: " + reverseNumber(num));
    }
}