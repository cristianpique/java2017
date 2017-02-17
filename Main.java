package com.company;

import java.util.Scanner;

class Cercle{

    static float radi=3;
    float variacio;

    static Cercle c = new Cercle();
    static Scanner s = new Scanner(System.in);

    public static void CalculVariacioCercle(){

        System.out.println("Variació del radi: ");
        c.variacio = s.nextFloat();
        s.nextLine();
        if(c.radi + c.variacio > 0) {
            c.radi += c.variacio;
        }
        else{
            System.out.println("Cercle no redimensionat: el radi no pot quedar negatiu.");
        }

    }
};

class Rectangle {

    static float base=2;
    static float altura=5;
    float variaciob;
    float variacioa;

    public static void CalculVariacioRectangle(){

        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);

        System.out.println("Variació de la base: ");
        r.variaciob = s.nextFloat();
        s.nextLine();
        if(r.base+r.variaciob > 0) {
            r.base += r.variaciob;
        }
        else{
            System.out.println("La Base del Rectangle no s'ha modificat: La base no pot ser negativa. ");
        }

        System.out.println("Variació de l'altura: ");
        r.variacioa = s.nextFloat();
        s.nextLine();
        if(r.altura+r.variacioa > 0) {
            r.altura += r.variacioa;
        }
        else{
            System.out.println("L'Altura del Rectangle no s'ha modificat: L'altura no pot ser negativa. ");
        }
    }
};

class Donut {

    static float re=3;
    static float ri=3;
    float vre;
    float vri;

    public static void CalculVariacioDonut(){

        Donut d = new Donut();
        Scanner s = new Scanner(System.in);

        System.out.println("Introdueix variacio radi exterior: ");
        d.vre=s.nextFloat();
        s.nextLine();
        if(d.re+d.vre>d.ri){
            d.re +=d.vre;
        }
        else{
            System.out.println("El radi exterior no s'ha modificat: El Radi Exterior no pot ser negatiu");
        }

        System.out.println("Introdueix variacio radi interior: ");
        d.vri=s.nextFloat();
        s.nextLine();
        if(d.ri+d.vri<d.re) {
            d.ri +=d.vri;
        }
        else{
            System.out.println("El radi interior no s'ha modificat. El Radi Interior no pot ser negatiu");
        }
    }
};

class Con{

    static float radi=4;
    static float generatriu=3;
    float vr;
    float vg;

    public static void CalculVariacioCon(){

        Con c = new Con();
        Scanner s = new Scanner(System.in);

        System.out.println("Introdueix variacio radi: ");
        c.vr=s.nextFloat();
        s.nextLine();
        if(c.radi+c.vr > 0){
            c.radi+=c.vr;
        }
        else{
            System.out.println("El radi no s'ha modificat. El Radi no pot ser negatiu");
        }

        System.out.println("Introdueix variacio generatriu: ");
        c.vg=s.nextFloat();
        s.nextLine();
        if(c.generatriu+c.vg > 0){
            c.generatriu+=c.vg;
        }
        else{
            System.out.println("La generatriu no s'ha modificat. La Generatriu no pot ser negativa");
        }

    }
};

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcio;
        while(true){
            System.out.println("Area cercle: " + 2*Math.PI*Cercle.radi);
            System.out.println("Area rectangle: " + Rectangle.base*Rectangle.altura);
            System.out.println("Area donut: " + (2*Math.PI*Donut.re - 2*Math.PI*Donut.ri));
            System.out.println("Area con : "+(Math.PI*Con.radi*Con.generatriu+Math.PI*Math.pow(Con.radi,2)));

            System.out.println("a Redimensionar cercle");
            System.out.println("b Redimensionar rectangle");
            System.out.println("c Redimensionar donut");
            System.out.println("d Redimensionar con");

            opcio = scanner.nextLine();
            switch (opcio){
                case "a":Cercle.CalculVariacioCercle();
                         break;

                case "b":Rectangle.CalculVariacioRectangle();
                         break;

                case "c":Donut.CalculVariacioDonut();
                         break;

                case "d":Con.CalculVariacioCon();
                         break;
            }
        }
    }
}