package com.company;

import java.util.Scanner;

class Cercle{

    float radi;
    float variacio;
};

class Rectangle {

    float base;
    float altura;
    float variaciob;
    float variacioa;
};

class Donut {

    float re;
    float ri;
};

class Con{

    float radi;
    float generatriu;
    float vr;
    float vg;
};

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cercle c = new Cercle();
        c.radi=3;

        Rectangle r = new Rectangle();
        r.base=2;
        r.altura=5;

        Donut d = new Donut();
        d.re=3;
        d.ri=3;

        Con co = new Con();
        co.radi=4;
        co.generatriu=3;

        String opcio;
        while(true){
            System.out.println("Area cercle: " + 2*Math.PI*c.radi);
            System.out.println("Area rectangle: " + r.base*r.altura);
            System.out.println("Area donut: " + (2*Math.PI*d.re - 2*Math.PI*d.ri));
            System.out.println("Area con : "+(Math.PI*co.radi*co.generatriu+Math.PI*Math.pow(co.radi,2)));

            System.out.println("a Redimensionar cercle");
            System.out.println("b Redimensionar rectangle");
            System.out.println("c Redimensionar donut");
            System.out.println("d Redimensionar con");

            opcio = scanner.nextLine();
            switch (opcio){
                case "a":
                    System.out.println("Variació del radi: ");
                    c.variacio = scanner.nextFloat();
                    scanner.nextLine();
                    if(c.radi + c.variacio > 0) {
                        c.radi += c.variacio;
                    }else{
                        System.out.println("Cercle no redimensionat: el radi no pot quedar negatiu.");
                    }
                    break;

                case "b":
                    System.out.println("Variació de la base: ");
                    r.variaciob = scanner.nextFloat();
                    scanner.nextLine();
                    if(r.variaciob>0) {
                        r.base += r.variaciob;
                    }
                    else{
                        System.out.println("Variacio de la base incorrecta. No pot ser un nombre negatiu. ");
                    }

                    System.out.println("Variació de l'altura: ");
                    r.variacioa = scanner.nextFloat();
                    scanner.nextLine();
                    if(r.variacioa>0) {
                        r.altura += r.variacioa;
                    }
                    else{
                        System.out.println("Variacio de l'altura incorrecta. No pot ser un nombre negatiu. ");
                }
                    break;

                case "c":
                    System.out.println("Introdueix variacio radi exterior: ");
                    d.re=scanner.nextFloat();
                    scanner.nextLine();
                    if(d.re>d.ri){
                        d.ri +=d.re;
                    }
                    else{
                        System.out.println("Variacio del radi exterior incorrecta. El valor no pot ser negatiu");
                    }

                    System.out.println("Introdueix variacio radi interior: ");
                    d.ri=scanner.nextFloat();
                    scanner.nextLine();
                    if(d.ri<d.re) {
                        d.re +=d.ri;
                    }
                    else{
                        System.out.println("Variacio del radi interior incorrecta. El valor no pot ser negatiu");
                    }
                    break;

                case "d":

                    System.out.println("Introdueix variacio radi: ");
                    co.vr=scanner.nextFloat();
                    scanner.nextLine();
                    if(co.vr>0){
                            co.radi+=co.vr;
                    }
                    else{
                        System.out.println("Variacio del radi incorrecta. El radi no pot ser negatiu");
                    }

                    System.out.println("Introdueix variacio generatriu: ");
                    co.vg=scanner.nextFloat();
                    scanner.nextLine();
                    if(co.vg>0){
                        co.generatriu+=co.vg;
                    }
                    else{
                        System.out.println("Variacio de la generatriu incorrecta. La generatriu no pot ser negativa");
                    }

            }
        }
    }
}