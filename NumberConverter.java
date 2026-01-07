import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Number Converter ===");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Hexadecimal");
        System.out.println("3. Binary to Decimal");
        System.out.print("Choose an option (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimal = scanner.nextInt();
                System.out.println("Binary: " + Integer.toBinaryString(decimal));
                break;
            case 2:
                System.out.print("Enter a decimal number: ");
                int num = scanner.nextInt();
                System.out.println("Hexadecimal: " + Integer.toHexString(num));
                break;
            case 3:
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                System.out.println("Decimal: " + Integer.parseInt(binary, 2));
                break;
            default:
                System.out.println("Invalid option");
        }
        
        scanner.close();
    }
}