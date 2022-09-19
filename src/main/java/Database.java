import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    // Opretter Arrayliste
    private ArrayList <Superhero> superheroes = new ArrayList<>();

    public void addHero(String name, String heroName, int age, String race, String superPower,  double strength, int creationYear){
        superheroes.add(new Superhero(name,heroName,age,race,superPower,strength,creationYear));
    }

    public int getSuperhero(int i) {
        return superheroes.indexOf(i);
    }

    public void printSuperheroes() {
        System.out.println("List of heros");
        for (Superhero s :superheroes) {
            System.out.println(s);
        }
    }

    public void  searchSuperhero ()
    {
        System.out.println(" Søg efter din hero. Intast navnet ");
        Scanner ss = new Scanner(System.in);
    }
}
