import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Opretter et objet, af klassen Superhero.
        Superhero superhero = new Superhero("Bruce ","Batmand",32," Human"," Money",45.4,1992);

        //Printer velkomsttekst.
        //Scanner modtager brugerinput.
        System.out.println("\nVelkommen til superhelte universet"+ " \nIndtast dine oplysninger hælt");
        System.out.println("\n Indtast venligst dit Navn");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("\nIndtast dit superhelte navn");
        String heroName= scanner.nextLine();

        System.out.println("\nIndtast din alder");
        int age= scanner.nextInt();

        System.out.println("\nIndtast dit race");
        String race= scanner.nextLine();

        System.out.println("\nIndtast din superkræft");
        String superPower= scanner.nextLine();

        System.out.println("\nIndtast din styrke");
        double strength= scanner.nextDouble();

        System.out.println("\nIndtast dit oprettelses år");
        int creationYear= scanner.nextInt();





    }
    }

