import java.util.Scanner;
public class AddTwoNums {
    static void main() {

        Scanner sc = new Scanner(System.in);

        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();


        System.out.printf("합계: %.1f\n", f1+f2);
    }
}
