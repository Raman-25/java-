public class q7 {
    static int fibb(int n){
        if(n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else {
            return fibb(n - 1) + fibb(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibb(5));  // Output will be: 3
    }
}
