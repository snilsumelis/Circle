import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double pi = 3.14;
        int r,a;
        double alan, cevre, dilim_alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıcap degeri giriniz: ");
        r = input.nextInt();
        System.out.print("acı degeri giriniz: ");
        a = input.nextInt();

        alan = pi*r*r;
        cevre= pi*2*r;
        dilim_alan =((pi*(r*r)*a)/360);

        System.out.print("\nDairenin alanı: " +alan);
        System.out.print("\nDairenin cevresi: " +cevre);
        System.out.print("\nDairenin dilim alanı: " +dilim_alan);






    }
}
