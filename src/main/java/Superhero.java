public class Superhero {

    //Atrbutter til superhelte
    private String name;
    private String heroName;
    private int age;
    private String race;
    private String superPower;
    private double strength;
    private int creationYear;


    //Opretter og overlorader konstruktør
    Superhero (String name, String heroName, int age, String race, String superPower,  double strength, int creationYear)
    {
        this.name = name;
        this.heroName = heroName;
        this.age = age;
        this.race = race;
        this.superPower = superPower;
        this.strength = strength;
        this.creationYear = creationYear;
    }


// Tilføjer GetMetoder
    public String getName() {
        return name;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public String getSuperPower() {
        return superPower;
    }

    public double getStrength() {
        return strength;
    }

    public int getCreationYear() {
        return creationYear;
    }

    // Tilføjer SetMetoder
    public void setStrength(double strength) {
        this.strength = strength;
    }

    public String toString() {
        return  "\nname = " + name +
                "\nheroName = " + heroName +
                "\nage = " + age +
                "\nrace = " + race +
                "\nsuperPower = '" + superPower +
                "\nstrength = " + strength +
                "\ncreationYear = " + creationYear + "\n";
    }
}
