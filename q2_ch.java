public class q2_ch {
    public static void main(String[] args) {
        q2_ch obj = new q2_ch();
        System.out.println("10th Fibonacci number: " + obj.fib(10));
        System.out.println("5th Prime number: " + obj.cal_prime(5));
    }

    // Function to return the nth Fibonacci number
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;

        int e1 = 0, e2 = 1, result = 0;
        for (int i = 3; i <= n; i++) {
            result = e1 + e2;
            e1 = e2;
            e2 = result;
        }
        return result;
    }

    // Function to return the nth prime number
    public int cal_prime(int n) {
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
