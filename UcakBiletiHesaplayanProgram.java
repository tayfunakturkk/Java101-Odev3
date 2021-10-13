package Odev3;
import java.util.Scanner;
public class UcakBiletiHesaplayanProgram {
    public static void main(String[] args) {
        int distance, age, triptype;
        double fareparedistance = 0.10;
        double normalamount, totalamount,discountedamount;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz:");
        distance = input.nextInt();
        if (distance < 0 ) {
            System.out.println("Hatalı Veri Girdiniz!");

        }

        System.out.print("Yaşınızı Giriniz:");
        age = input.nextInt();
        if (age <= 0){
            System.out.println("Hatalı Veri Girdiniz!");

        }

        System.out.print("Yolculuk Tipini Giriniz(1 ==>Tek Yön,2==>Gidiş Dönüş):");
        triptype = input.nextInt();
        if (triptype != 1 && triptype != 2) {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        normalamount = distance * fareparedistance;

         switch (triptype) {
             case 1:
                 if (age < 12) {
                     totalamount = normalamount - (normalamount * 0.50);
                     System.out.println("Toplam Tutar:" + totalamount);
                 } else if (12 < age && age < 24) {
                     totalamount = normalamount - (normalamount * 0.10);
                     System.out.println("Toplam Tutar:" + totalamount);
                 } else if (age > 65) {
                     totalamount = normalamount - (normalamount * 0.30);
                     System.out.println("Toplam Tutar:" + totalamount);

                 } else {
                     System.out.println("Toplam Tutar:" + normalamount);
                 }
                 break;


             case 2:
                 if (age < 12) {
                     discountedamount = normalamount - (normalamount * 0.50);
                     totalamount = discountedamount - (discountedamount * 0.20);
                     System.out.println("Toplam Tutar:" + 2*totalamount);
                 } else if (12 < age && age < 24) {
                     discountedamount = normalamount - (normalamount * 0.10);
                     totalamount = discountedamount - (discountedamount * 0.20);
                     System.out.println("Toplam Tutar:" + 2*totalamount);
                 } else if (age > 65) {
                     discountedamount = normalamount - (normalamount * 0.30);
                     totalamount = discountedamount - (discountedamount * 0.20);
                     System.out.println("Toplam Tutar:" + 2*totalamount);
                 } else {
                     discountedamount=normalamount-(normalamount*0.20);
                     System.out.println("Toplam Tutar:" + 2*discountedamount);
                 }
                 break;



         }
    }
}
