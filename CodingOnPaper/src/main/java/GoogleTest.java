public class GoogleTest {

    /**
     * Searching for two numbers in an array. If the sum of the two numbers is equal to the number you are looking for the result shows the two number's position in the array.
     *
     * @param ints an array numbers
     * @param num  the number we're looking for
     * @return the position of two numbers in the array
     */
    public GoogleTestResult find(int[] ints, int num) {
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (i != j && ints[i] + ints[j] == num) {
                    result1 = i;
                    result2 = j;
                    return new GoogleTestResult(result1, result2);
                }
            }
        }
        return new GoogleTestResult(-1, -1);
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(new GoogleTest().find(ints, 8));
        System.out.println(new GoogleTest().find(ints, 24));
    }

}
