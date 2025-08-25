public class q6 {
    static void pattern(int n){
        for(int i = n; i>=0; i--){
            for(int j =1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
