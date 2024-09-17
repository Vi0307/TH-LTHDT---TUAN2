import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap vao so tien gui:");
        int tien=sc.nextInt();
    System.out.println("Nhap vao so tien lai:");
        float ls=sc.nextInt();
    System.out.println("Nhap so thang gui:");
        short thg=sc.nextShort();
    float lai=tien*ls/100/12*thg;
    System.out.println("So tien goc: "+tien);
    System.out.println("So tien lai: "+lai);
    }
}
