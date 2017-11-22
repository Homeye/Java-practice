public class FizzBuzz {

    /**
     * Basic implementation of the "Fizz buzz" game: https://en.wikipedia.org/wiki/Fizz_buzz
     *
     * @param number length of the game
     * @return the numbers or the words "Fizz", "Buzz", "Fizz Buzz" according to the rules
     */
    public String fizzBuzz(int number) {
        if (number < 1) {
            return "";
        }
        String result = "";
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result += " " + "Fizz buzz";
            }
            if (i % 5 == 0 && i % 3 != 0) {
                result += " " + "Buzz";
            }
            if (i % 5 != 0 && i % 3 == 0) {
                result += " " + "Fizz";
            }
            if (i % 5 != 0 && i % 3 != 0) {
                result += " " + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(20));
    }

}
