import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkçe, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik dersi notunuz:");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik dersi notunuz:");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya dersi notunuz:");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe dersi notunuz:");
        turkçe = inp.nextInt();
        System.out.println(turkçe);

        System.out.print("Tarih dersi notunuz:");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik dersi notunuz:");
        muzik = inp.nextInt();
        System.out.println(muzik);

        int toplam = (mat+fizik+kimya+turkçe+tarih+muzik);
        double sonuç = toplam / 6;
        System.out.print("Ortalama:");
        System.out.println(sonuç);

        boolean geçti = sonuç > 60;
        boolean kaldı = sonuç <= 60;
        boolean sonuc = geçti || kaldı;
         String str = sonuç > 60? "Geçti" : "Kaldı";
         String vtr = sonuç <= 60? "Kaldı" : "Geçti";
         System.out.println(str);




    }
}
