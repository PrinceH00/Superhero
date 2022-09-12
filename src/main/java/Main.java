import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Superhero superhero = new Superhero("Bruce ","Batmand",32," Human"," Money",45.4,1992);




    }

    public void intro(){
        System.out.println("\nVelkommen til superhelte universet"+ " \nIndtast dine oplysninger hælt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        String name = scanner.nextLine();
        System.out.println("\n");
        String heroName= scanner.nextLine();
        System.out.println("\n");
        int age= scanner.nextInt();
        System.out.println("\n");
        String race= scanner.nextLine();
        System.out.println("\n");
        String superPower= scanner.nextLine();
        System.out.println("\n");
        double strength= scanner.nextDouble();
        System.out.println("\n");
        int creationYear= scanner.nextInt();
    }
}
