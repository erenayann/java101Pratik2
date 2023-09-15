package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();

        double kdv = (tutar < 1000) ? 0.18 : 0.08;
        double kdvDeger = kdv * tutar;
        double kdvliTutar = tutar + kdvDeger;

        System.out.println("Tutar:" + tutar);
        System.out.println("KDV Oranı:" + kdv);
        System.out.println("KDV Değeri:" + kdvDeger);
        System.out.println("KDV'li Tutar:" + kdvliTutar);

    }
}
