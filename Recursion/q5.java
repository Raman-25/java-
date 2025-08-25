public class q5 {
    static int sum(int n) {
        int sum1 = 0; // Initialize sum1

        if (n == 1) {
            return 1;
        } else {
            sum1 = n + sum(n - 1); // Store result of recursive call
        }

        return sum1; // Return the computed sum
    }

    public static void main(String[] args) {
        System.out.println(sum(10)); // Output will be 55
    }
}
