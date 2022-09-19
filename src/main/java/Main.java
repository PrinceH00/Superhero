import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Opretter et objet, af klassen Superhero.
        Database database = new  Database();


        //Printer velkomsttekst.
        //Scanner modtager brugerinput.
        System.out.println("\nVelkommen til superhelte universet");


        while (true) {
            System.out.println(""" 
                1. Opret superhelt  
                2. Se liste af Heros
                9. Afslut""");

            int userchoise = scanner.nextInt();

            if (userchoise == 1) {

                System.out.println("\nIndtast venligst dit Navn");
                String name = scanner.next();

                System.out.println("Indtast dit superhelte navn");
                String heroName = scanner.next();

                System.out.println("Indtast din alder");
                int age = scanner.nextInt();

                System.out.println("Indtast dit race");
                String race = scanner.next();

                System.out.println("Indtast din superkræft");
                String superPower = scanner.next();

                System.out.println("Indtast din styrke");
                double strength = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Indtast dit oprettelses år \n");
                int creationYear = scanner.nextInt();

                database.addHero(name, heroName, age, race, superPower, strength, creationYear);


            }else if (userchoise == 2) {
                database.printSuperheroes();
            }else{
                break;
            }

        }
    }
    }

/* while (!scanner.hasNextInt()) {
                    String text = scanner.next();
                    System.out.println("Du må ikke indtaste " + text + " det skal være et tal");
                    }
                */