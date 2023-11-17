public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
    // 2. reverseInteger
    public static String reverseInteger(int n) {
        String str = String.valueOf(n);
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString();
    }
    // 3. encryptThis


    // 4. decipherThis


}