public class q8 {
    static float avg(float... arr){//ARRAY IS FORMED
        float sum = 0;
        for(float a:arr){
            sum=sum+a;
        }
        return sum/arr.length;
    }

    static void main() {
        System.out.println(avg(10,46,78,89,90,67,89,56,35,4665));
    }
}
