import java.util.Scanner;
public class bai2 {
    static Scanner sc;
    static int Tuoi;
    static String Ten;
    static int CC;
    static boolean Thich;
    static void IN()
    {
        System.out.println("Nhap ten cua ban:");
            Ten=sc.nextLine();
        System.out.println("Nhap tuoi cua ban:");
            Tuoi=sc.nextInt();
        System.out.println("Nhap chieu cao cua ban:");
            CC=sc.nextInt();
        System.out.println("Ban co thich lap trinh khong?");
            Thich=sc.nextBoolean();
    }       
    static void OUT()
    {
        System.out.println("Thong tin cua ban:");
        System.out.println("Ten: "+Ten);
        System.out.println("Tuoi: "+Tuoi);
        System.out.println("Chieu cao: "+CC);
        if(Thich)
            System.out.println("Toi thich lap trinh");
        else
            System.out.println("Toi khong thich lap trinh");
    }
    public static void main(String[] args) {
        sc= new Scanner(System.in);
        IN();
        OUT();
    }
}