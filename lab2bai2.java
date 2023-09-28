import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2bai2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so:");
    try {
        int number = scanner.nextInt();
        System.out.println("So nhap vao la: " + number);
    } catch (InputMismatchException ime) {
        System.out.println("Vui long nhap so!");
    }
    System.out.println("Ket thuc chuong trinh!");
}
}

