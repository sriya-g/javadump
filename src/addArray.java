import java.util.Scanner;
public class addArray {
    public static double compute_sum(double array[]) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("a: ");
        double a = keyboard.nextDouble();
        System.out.print("b: ");
        double b = keyboard.nextDouble();
        System.out.print("c: ");
        double c = keyboard.nextDouble();
        System.out.print("d: ");
        double d = keyboard.nextDouble();
        double array[] = {a,b,c,d};
        System.out.println(compute_sum(array));
    }
}
