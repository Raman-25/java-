public class re2 {
    static int Table(int n) {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product = n * i;
            System.out.println(product);
        }
        return product; // Returns the last product (n * 10)
    }

    public static void main(String[] args) {
        Table(8); // This will print the table of 8
    }
}
