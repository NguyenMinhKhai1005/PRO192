import java.util.Scanner;

public class testthu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diemchuyencan = sc.nextDouble();
        double giuaky = sc.nextDouble();
        double cuoiky = sc.nextDouble();
        double hocphan = diemchuyencan*0.1 + giuaky*0.2 + cuoiky*0.7;
        System.out.println("hocphan = " + (hocphan));
    }
}
