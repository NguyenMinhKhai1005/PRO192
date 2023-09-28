import java.util.Scanner;

public class lab2bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so:");
    try {
        int number = scanner.nextInt();
        System.out.println("So nhap vao la: " + number);
        int error = number / 0;
    }  catch (ArithmeticException ae) {
        System.out.println("So vua nhap khong chia het cho 0!");
    }
    System.out.println("Ket thuc chuong trinh!");
}
}
