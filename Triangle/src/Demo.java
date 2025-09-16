import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter side 3: ");
        int side3 = scanner.nextInt();

        if (isTriangle(side1, side2, side3)) {   // if its result is true 
            System.out.println("This is a triangle");
        } else {  // if its result is false
            System.out.println("This is not a triangle");
        }
        scanner.close();

    }

    public static boolean isTriangle(double a, double b, double c) {
        // The sum of any two sides must be greater than the third
        if ((a + b > c) && 
            (a + c > b) &&
            (b + c > a)) {
            return true;
        }
        return false;
    }
}
