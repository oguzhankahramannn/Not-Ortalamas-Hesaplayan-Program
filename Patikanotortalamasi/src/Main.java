import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,biyoloji,beden;
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuz giriniz : ");
        mat = scan.nextInt();

        System.out.println("Fizik notunuz giriniz : ");
        fizik = scan.nextInt();

        System.out.println("Kimya notunuz giriniz : ");
        kimya = scan.nextInt();

        System.out.println("Turkce notunuz giriniz : ");
        turkce = scan.nextInt();

        System.out.println("Biyoloji notunuz giriniz : ");
        biyoloji = scan.nextInt();

        System.out.println("Beden notunuz giriniz : ");
        beden = scan.nextInt();

        int toplam = (mat+fizik+kimya+turkce+biyoloji+beden);
        double ortalama= toplam/6.0;
        boolean sonuc = ortalama>60;
        String gecer = sonuc ? "Bu dersten gectiniz" : "Bu dersten kaldınız" ;

        System.out.println("Ortalamanız:" + ortalama + " " + gecer);



    }
}