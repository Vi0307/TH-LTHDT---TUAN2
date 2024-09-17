import java.util.Scanner;
public class bai1 {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        System.out.println("Nhập tên");
        String ten=sc.nextLine();
        System.out.print("Hello"+ten);
    }
}
