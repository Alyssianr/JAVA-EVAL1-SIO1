package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
import java.util.Scanner;

                    class Exercice 1 {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Entrer un nombre : ");
                        double nombre = scanner.nextDouble();
                        double puissance = getPuissance(scanner);
                        double resultat = Math.pow(nombre, puissance);
                        System.out.printf("Le résultat de %.2f puissance %.2f est %.2f%n", nombre, puissance, resultat);
                        scanner.close();
                    }
                    private static double getPuissance(Scanner scanner) {
                        double puissance = -1;
                        while (puissance < 0) {
                            System.out.print("Entrer la puissance (doit être >= 0) : ");
                            if (scanner.hasNextDouble()) {
                                puissance = scanner.nextDouble();
                                if (puissance < 0) {
                                    System.out.println("La puissance doit être supérieure ou égale à 0.");
                                }
                            } else {
                                System.out.println("Veuillez entrer un nombre valide.");
                                scanner.next();
                            }
                        }
                        return puissance;
                    }
                }
            }
        }
        System.out.println("---------------------------------------------");
        break;
        case 2:
        System.out.println("---------------------------------------------");
        System.out.println("Exercice 2");
        System.out.println("---------------------------------------------");
        //Exercice 2 : Entrer votre code ici
import java.util.Scanner;

        public class Exercice 2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double kilometres;
                while (true) {
                    System.out.print("Entrer le nombre de kilomètres parcourus par le client : ");
                    kilometres = scanner.nextDouble();
                    if (kilometres >= 0) {
                        break;
                    } else {
                        System.out.println("Le nombre de kilomètres parcourus par le client doit être supérieur ou égal à 0.");
                    }
                }
                double frais = 0;
                if (kilometres < 100) {
                    frais = kilometres * 0.20;
                } else if (kilometres >= 100 && kilometres <= 500) {
                    frais = kilometres * 0.50;
                } else {
                    frais = kilometres * 0.80;
                }
                System.out.printf("Le montant à payer par le client est : %.2f€%n", frais);
                scanner.close();
            }
        }
        System.out.println("---------------------------------------------");
        break;
        case 3:
        System.out.println("---------------------------------------------");
        System.out.println("Exercice 3");
        System.out.println("---------------------------------------------");
        //Exercice 3 : Entrer votre code ici

import java.util.Scanner;

        class Exercice 3 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int largeur;
                int hauteur;
                while (true) {
                    System.out.print("Entrer la largeur du rectangle : ");
                    largeur = scanner.nextInt();
                    if (largeur >= 0) {
                        break;
                    } else {
                        System.out.println("La largeur doit être supérieure ou égale à 0.");
                    }
                }
                while (true) {
                    System.out.print("Entrer la hauteur du rectangle : ");
                    hauteur = scanner.nextInt();
                    if (hauteur >= 0) {
                        break;
                    } else {
                        System.out.println("La hauteur doit être supérieure ou égale à 0.");
                    }
                }
                for (int i = 0; i < hauteur; i++) {
                    for (int j = 0; j < largeur; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                scanner.close();
            }
        }
        System.out.println("---------------------------------------------");

        break;
        case 4:
        System.out.println("---------------------------------------------");
        System.out.println("Exercice 4");
        System.out.println("---------------------------------------------");
        //Exercice 4 : Entrer votre code ici
import java.util.Scanner;

        class Exercice 4 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int nombre;
                while (true) {
                    System.out.print("Entrer un nombre entier non négatif : ");
                    nombre = scanner.nextInt();
                    if (nombre >= 0) {
                        break;
                    } else {
                        System.out.println("Le nombre doit être supérieur ou égal à 0.");
                    }
                }
                long factorielle = 1;
                for (int i = 1; i <= nombre; i++) {
                    factorielle *= i;
                }
                System.out.printf("Le factoriel de %d est : %d%n", nombre, factorielle);
                scanner.close();
            }
        }
        System.out.println("---------------------------------------------");
        break;
        case 0:
        System.out.println(RESET);
        System.exit(0);
        break;
    }
}


}