public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int sqrtN = (int) Math.sqrt(num);
        for (int x = 2; x <= sqrtN; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 500; x++) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
