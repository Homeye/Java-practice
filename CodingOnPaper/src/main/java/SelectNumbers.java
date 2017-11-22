import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectNumbers {

    /**
     * From an array, selects the numbers that can be divided without residue with the two given numbers
     *
     * @param numbers       the array of numbers
     * @param firstDivider
     * @param secondDivider
     * @return the numbers from the array
     */
    public List<Integer> selectNumbers(List<Integer> numbers, int firstDivider, int secondDivider) {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer integer : numbers) {
            if (integer % firstDivider == 0 && integer % secondDivider == 0) {
                result.add(integer);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> listOne = Arrays.asList(1, 2, 3, 4, 6, 12, 24, 36);
        System.out.println(new SelectNumbers().selectNumbers(listOne, 4, 3));

        List<Integer> listTwo = Arrays.asList(1, 6, 10, 12, 54);
        System.out.println(new SelectNumbers().selectNumbers(listTwo, 3, 6));
    }
}
