package Pokemon;

public class FirePokemon extends Pokemon {
    private int height;
    private int weight;

    public FirePokemon (int height, int weight, String name, int level, double hp, double xp) {
        super(name, level, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    public static int flameThrower () {
//random number = 10% kans op target burning
    }

    public static void fireLash() {

    }

    public void eats() {
        System.out.println("FirePokemon loves to eat corn, but he keeps burning it into popcorn");
    }
    public void speaks() {
        System.out.println("FirePokemon says: kriii kriii ");
    }
}
