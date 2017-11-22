public class Sequence {

    /**
     * Examines the numbers of the given array if there is a sequence between them
     *
     * @param numbers
     * @return if the numbers are increasing or decreasing
     */
    public boolean isSequence(int[] numbers) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < numbers.length && increasing; i++) {
            increasing = numbers[i] > numbers[i - 1];
        }
        for (int i = 1; i < numbers.length && decreasing; i++) {
            decreasing = numbers[i] < numbers[i - 1];
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] numbersOne = {1, 4, 2, 6};
        System.out.println(new Sequence().isSequence(numbersOne));

        int[] numbersTwo = {1, 2, 4, 6};
        System.out.println(new Sequence().isSequence(numbersTwo));

        int[] numbersThree = {32423, 432, 200, 4};
        System.out.println(new Sequence().isSequence(numbersThree));
    }

}
