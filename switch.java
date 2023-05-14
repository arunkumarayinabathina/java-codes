import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int f;
        int s;
        int r;

        System.out.println("PICK THE BELOW ONE OPERATION YOU WANT TO PERFORM\n");
        System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS DIVISION\n6.POWER OF A NUMBER");

        int pick = n.nextInt();
        switch (pick) {
            case 1:
                System.out.println("ADDITION");
                System.out.print("Enter first number: ");
                f = n.nextInt();
                System.out.print("Enter second number: ");
                s = n.nextInt();
                r = f + s;
                System.out.println("Sum of two numbers: " + r);
                break;
            case 2:
                System.out.println("SUBTRACTION");
                System.out.print("Enter first number: ");
                f = n.nextInt();
                System.out.print("Enter second number: ");
                s = n.nextInt();
                r = f - s;
                System.out.println("Difference of two numbers: " + r);
                break;
            case 3:
                System.out.println("MULTIPLICATION");
                System.out.print("Enter first number: ");
                f = n.nextInt();
                System.out.print("Enter second number: ");
                s = n.nextInt();
                r = f * s;
                System.out.println("Multiplication of two numbers: " + r);
                break;
            case 4:
                System.out.println("DIVISION");
                System.out.print("Enter dividend number: ");
                f = n.nextInt();
                System.out.print("Enter divisor number: ");
                s = n.nextInt();
                r = f / s;
                System.out.println("Quotient of two numbers: " + r);
                break;
            case 5:
                System.out.println("MODULUS DIVISION");
                System.out.print("Enter dividend number: ");
                f = n.nextInt();
                System.out.print("Enter divisor number: ");
                s = n.nextInt();
                r = f % s;
                System.out.println("Reminder of two numbers: " + r);
                break;
            case 6:
                System.out.println("POWER");
                System.out.print("Enter base number: ");
                f = n.nextInt();
                System.out.print("Enter exponent number: ");
                s = n.nextInt();
                int k = 1;
                for (int i = 1; i <= s; i++) {
                    k *= f;
                }
                System.out.println("Power of " + f + " with " + s + " is " + k);
                break;
            default:
                System.out.println("INVALID PICK");
                break;
        }
    }
}

