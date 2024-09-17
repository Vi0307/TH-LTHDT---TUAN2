import java.util.Scanner;
public class bai3 {
    static Scanner sc;
    static int a;
    static int b;
    static int Tong;
    static int Hieu;
    static int Tich;
    static int Thuong;
    static int Du;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen duong:");
        a=sc.nextInt();
        b=sc.nextInt();
        Tong=a+b;
        Hieu=a-b;
        Tich=a*b;
        Thuong=a/b;
        Du=a%b;
        System.out.println("Tong "+Tong);
        System.out.println("Hieu "+Hieu);
        System.out.println("Tich "+Tich);
        System.out.println("Thuong "+Thuong + " Du "+Du);
    }
}
