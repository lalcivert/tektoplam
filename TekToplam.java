package day01;

import java.util.Scanner;

public class TekToplam {
    public static void main(String[] args) {
        int sayi;
        int toplam=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("sayi giriniz: ");
            sayi=input.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);


        System.out.println("Toplam: "+toplam);
    }
}
