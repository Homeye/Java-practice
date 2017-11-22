public class LeastCommonMultiple {

    /**
     * Searching for the least common multiple of two numbers
     *
     * @param numberOne
     * @param numberTwo
     * @return the least common multiple
     */
    public int findLeastCommonMultiple(int numberOne, int numberTwo) {
        int result = 0;
        int i = 1;
        boolean found = false;
        while (i > 0 && !found) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                result = i;
                found = true;
            } else if (i == Integer.MAX_VALUE && (i % numberOne != 0 || i % numberTwo != 0)) {
                throw new ArithmeticException("Can't find common multiple!");
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LeastCommonMultiple().findLeastCommonMultiple(4, 6));
        System.out.println(new LeastCommonMultiple().findLeastCommonMultiple(234567, 126));
    }

}
