package com.company;

import java.util.Scanner;

public class E1 {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\t====================================");
            System.out.println("\t  CALCUL AREA FIGURES GEOMETRIQUES ");
            System.out.print("\t====================================\n");
            System.out.println("\n\ta) Calcul Area Circumferencia");
            System.out.println("\tb) Calcul Longitud Circumferencia");
            System.out.println("\tc) Calcul Area Esfera");
            System.out.println("\td) Calcul Volum Cilindre");
            System.out.println("\te) Sortir\n");
            System.out.print("\tIntrodueix opcio: ");
            String opcio = s.nextLine();

            switch (opcio){

                case "a": System.out.print("\n\tIntrodueix radi circumferencia: ");
                          Float radic = s.nextFloat();
                          System.out.print("\n\tL'area de la circumferencia es de: "+Math.PI*radic*radic);
                          System.out.println(" cm\n");
                          break;

                case "b": System.out.print("\n\tIntrodueix radi circumferencia: ");
                          Float radil = s.nextFloat();
                          System.out.print("\n\tLa longitud de la circumferencia es de: "+2*Math.PI*radil);
                          System.out.println(" cm\n");
                          break;

                case "c": System.out.print("\n\tIntrodueix radi esfera: ");
                          Float radie=s.nextFloat();
                          System.out.print("\n\tL'area de l'esfera es de: "+4*Math.PI*radie*radie);
                          System.out.println(" cm\n");
                          break;

                case "d": System.out.print("\n\tIntrodueix radi cilindre: ");
                          Float radici=s.nextFloat();
                          System.out.print("\n\tIntrodueix altura cilindre: ");
                          Float alturac=s.nextFloat();
                          System.out.print("\n\t El volum del cilindre es de: "+Math.PI*radici*radici*alturac);
                          System.out.println(" cm\n");
                          break;

                case "e": return;
            }
        }
    }
}
