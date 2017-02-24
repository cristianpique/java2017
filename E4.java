/* Apartado a Ejercicio 4 */

package com.company;

import java.util.Scanner;

public class Main { /* Falta definir el paquet al que pertany la clase */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a Saludar\nb Acomiadar");
        String option = sc.nextLine();

        switch(option){
            case "a":
                System.out.println("Nom:");
                String nom = sc.nextLine();
                System.out.println("Hola " + nom);
                break;
            case "b":
                System.out.println("Nom:");
                nom = sc.nextLine(); /* La variable nom es trobava definida dues vegades */
                System.out.println("Adeu " + nom);
                break;
            default:
                System.out.println("Opcio incorrecta");
        }
    }
}

/* Apartado b Ejercicio 4 */

class led {
    boolean State;

    void switch_on(){
        State = true;
    }

    void Switch_off(){
        State = false;
    }
}

/* Apartado c Ejercicio 4 */

package com.company;

import java.util.Scanner;

 class Partida{
    String jugador1;
    String jugador2;
    int punts1;
    int punts2;

     Partida(String j1, String j2){ /* Aquest es un metode constructor, que s'ha d'anomenar com la seva clase, el nom indicat no era el de la seva clase */
        jugador1 = j1;
        jugador2 = j2;
    }

    int puntuar(String jugador, int punts){ /* El tipus de retorn del metode es trobava mal indicat, posava void i en realitat es int */
        if(jugador.equals(jugador1)){
            punts1 += punts;
        } else if(jugador.equals(jugador2)){
            punts2 += punts;
        }
    }

     String guanyador(int punts1,int punts2){
        if(punts1 > punts2){
            return jugador1;
        } else if (punts2 > punts1){
            return jugador2;
        } else {
            return "Empat";
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Partida p = new Partida("Cristian","Jacobo"); /* Faltaba definir els dos jugadors que faran la partida y que s'han de pasar per parametres*/

            p.jugador1 = "Joan";
            p.jugador2 = "Josep";
            p.punts1=3;
            p.punts2=4;

        int punts = p.puntuar("Josep", 4);
        p.puntuar(p.jugador1,p.punts1); /* Falta ajustar els parametres que rep */
        p.puntuar(p.jugador2,p.punts2); /* Falta ajustar els parametres que rep */

        System.out.println("Guanyador: " + p.guanyador(p.punts1,p.punts2)); /*  Falta pasar per parametres els valors del metode guanyador, que actualment no ho estan */
    }
}

/* Apartat d  Exercici 4 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int edat; /* Falta un System.out.println per mostrar a l'usuari que ha d'introduir l'edat a consultar. Un cop posat, pasem l'escanner, per recollir el valor que introdueix l'usuari. Per fer-ho, asignem a la variable edat l'escanner, pero sense indicar el tipus de variable, nomes el nom, ja que la declaracio s'ha de fer abans */

        Scanner scanner = new Scanner(System.in); /* Falta importar la clase Scanner, per tal que Java la reconegui */

        System.out.print("Introdueix edat: ");
        edat=scanner.nextInt();

        if(edat >= 18){
            System.out.println("Ets major d'edat"); /* Per mostrar un missatge per pantalla, hem d'usar System.out.println. En aquest cas, estavem declarant un String, sense indicar que ho mostres per pantalla */
        } else {
            System.out.println("Ets menor d'edat");
        }
    }
}