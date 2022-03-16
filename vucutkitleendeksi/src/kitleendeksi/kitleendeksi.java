package kitleendeksi;
import java.util.Scanner;


    public class kitleendeksi {
        public static void main(String[] args) {

            double height , weight,kitleendeksi;
            Scanner input =new Scanner(System.in);
            System.out.print("Kilonuzu Giriniz :");
            weight = input.nextDouble();
            System.out.print("Cm Cinsinden Boyunuzu Giriniz :");
            height =input.nextDouble();
            kitleendeksi = weight/(height*height);
            System.out.println("Vücut Kitle Endeksiniz : "+kitleendeksi);
        }
}
