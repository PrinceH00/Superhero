import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    // Opretter Arrayliste
    private ArrayList<String> superheroes = new ArrayList<>();
    //private Superhero[] superheroes = new Superhero[5];

    private int nummberOfSuperheros = 0;
    public void addHero(String name, String heroName, int age, String race, String superPower,  double strength, int creationYear){
        Superhero hero = new Superhero(name,heroName,age,race,superPower,strength,creationYear);
        superheroes[nummberOfSuperheros++] = hero;
    }

    public Superhero getSuperhero(int index) {
        return superheroes[index];
    }

    public void printSuperheroes() {
        for (Superhero s :superheroes) {
            System.out.println(s);
        }

    }
}
