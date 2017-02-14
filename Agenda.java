package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contacte{
    String nom;
    String telefon;
}

public class Agenda {

    static final int MAX_CONTACTE =2;

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        Contacte c = new Contacte();
        List<String> contacte = new ArrayList<>();

        while(true) {
            System.out.println("\t==========");
            System.out.println("\t  AGENDA");
            System.out.println("\t==========");
            System.out.println("\n\ta)Introduir contacte");
            System.out.println("\tb)Llistar contacte");
            System.out.println("\tc)Sortir\n");

            System.out.print("\tIntrodueix una opcio :");

            String opcio = s.nextLine();

            switch(opcio){
                case "a": for(int i=0;i<MAX_CONTACTE;i++) {
                    System.out.print("\n\tIntrodueix nom: ");
                    c.nom = s.nextLine();
                    System.out.print("\n\tIntrodueix telefon: ");
                    c.telefon = s.nextLine();
                    contacte.add(c.nom);
                    contacte.add(c.telefon);
                    }
                break;

                case "b": for(int i=0;i<contacte.size();i++) {
                    System.out.println(contacte.get(i));
                }
                break;

                case"c": return;


            }
        }
    }
}
