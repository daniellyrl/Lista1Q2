package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Qual é a sua primeira nota? ");
        a1.setN1(sc.nextDouble());
        System.out.println("Qual a sua segunda nota? ");
        a1.setN2(sc.nextDouble());
        a1.calculomedia();
        System.out.println("Sua média foi " + a1.getMedia());
    }
}
