public class ReverseNumber {

    /**
     * Reverse a number
     *
     * @param number
     * @return the reversed number
     */
    public int reverse(int number) {
        String result = "";
        String numStr = Integer.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i--) {
            result += numStr.charAt(i);
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverse(1234567));
    }

}
