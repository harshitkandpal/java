import java.util.ArrayList;

/**
 * Utility class to generate prime numbers up to a given limit using
 * the Sieve of Eratosthenes algorithm.
 */
public class PrimeNosN {

    /**
     * Generates all prime numbers up to the given integer n (inclusive).
     *
     * <p>
     * This method uses the classic Sieve of Eratosthenes algorithm:
     * <ul>
     *   <li>Initialize a boolean list marking all numbers as prime.</li>
     *   <li>Iteratively mark multiples of each prime as non-prime.</li>
     *   <li>Collect all numbers still marked as prime into a result list.</li>
     * </ul>
     * </p>
     *
     * @param n the upper limit (inclusive) up to which primes are generated.
     * @return an {@code ArrayList<Integer>} containing all prime numbers ≤ n.
     *
     * <p>Example:</p>
     * <pre>
     *   PrimeNosN.PrimeNosN(10) → [2, 3, 5, 7]
     * </pre>
     */
    public static ArrayList<Integer> PrimeNosN(int n) {
        ArrayList<Integer> primes = new ArrayList<>();      // Stores the resulting prime numbers
        ArrayList<Boolean> isPrime = new ArrayList<>(n + 1); // Marks whether each index is prime

        // Initialize all entries as true (assuming all numbers are prime initially)
        for (int i = 0; i <= n; i++) {
            isPrime.add(true);
        }

        // Sieve of Eratosthenes: mark multiples of each prime as false
        for (int i = 2; i * i <= n; i++) {
            if (isPrime.get(i)) { // If i is still prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime.set(j, false); // Mark multiples of i as not prime
                }
            }
        }

        // Collect all indices that remain marked as prime
        for (int i = 2; i <= n; i++) {
            if (isPrime.get(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    /**
     * Driver method to test the sieve implementation.
     * Prints all prime numbers up to 100.
     */
    public static void main(String[] args) {
        System.out.println(PrimeNosN(100));
    }
}
