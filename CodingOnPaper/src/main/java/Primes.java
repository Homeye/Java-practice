import java.util.ArrayList;
import java.util.List;

public class Primes {

    /**
     * Returns prime numbers
     *
     * @param from    where we want to start search prime numbers
     * @param howMany prime numbers we need
     * @return the found prime numbers
     */
    public List<Integer> findPrimes(int from, int howMany) {
        List<Integer> result = new ArrayList<Integer>();
        while (result.size() < howMany && from < Integer.MAX_VALUE) {
            if (isPrime(from)) {
                result.add(from);
            }
            from++;
        }
        if (result.size() < howMany) {
            throw new ArithmeticException("Can't find that many primes!");
        }
        return result;
    }

    /**
     * Check if the number is a prime number
     *
     * @param number we looking at
     * @return if it's a prime number
     */
    private boolean isPrime(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Primes().findPrimes(1, 20));
    }

}
