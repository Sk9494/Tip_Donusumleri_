import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //Data input
        System.out.print("İlk sayiyi giriniz : ");
        double ondalikliSayi =input.nextDouble();

        System.out.print("İkinci sayiyi giriniz : ");
        int  tamSayi =input.nextInt();


        // Tam sayıyı ondalıklı sayıya  dönüştürme

        double tamsayiondalikliSayi = tamSayi;

        //Ondalıklı sayıyı tam sayıya dönüştürme

        int ondalikliSayitamSayi =(int) ondalikliSayi;



        System.out.println("Tam sayiyi ondalikli sayiya dönüstürme : " + tamsayiondalikliSayi);
        System.out.println("Ondalıklı sayiyi tam sayiya dönüstürme : " + ondalikliSayitamSayi);
    }
}