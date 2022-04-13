package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

   int x,sayac=0,toplam=0;
   double ortalama;
        System.out.println("Sayı giriniz");
        x = input.nextInt();
        for (int i = 0; i <= x; i++)
            if (i % 12 == 0) {
                toplam+=i;
                sayac++;

            }
            ortalama = toplam / sayac;
            System.out.println("Ortalama : "+ ortalama  );

    }
}

