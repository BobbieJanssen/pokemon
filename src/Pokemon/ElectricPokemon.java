package Pokemon;

public class ElectricPokemon extends Pokemon {
    private double height;
    private double weight;

    public void setHeight(double myHeight) {
        this.height = myHeight;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double myWeight) {
        this.weight = myWeight;
    }
    public double getWeight() {
        return weight;
    }

    public ElectricPokemon (double height, double weight, String name, int level, double hp, int xp) {
        super(name, level, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    @Override public void theChosenOne() {
        System.out.println("I choose Electric Pokémon " + getName() + "!");
    }

    public static int boltStrike( Pokemon target, boolean hasElectriumZ) {
        int basePower = hasElectriumZ ? 195 : 130;

        if (hasElectriumZ) {
            System.out.println(target.getName() + " is using Bolt Strike with Electrium Z! Bolt Strike turns into Gigavolt Havoc with base power: " + basePower);
        } else {
            System.out.println(target.getName() + " is using Bolt Strike! Base Power: " + basePower);
        }

        double newHp = target.getHp() - basePower;
        target.setHp((int) newHp);

        System.out.println(target.getName() + "'s HP is now " + target.getHp());

        if (Math.random() < 0.2) {
            System.out.println(target.getName() + " is paralyzed!");
        } else {
            System.out.println(target.getName() + " is not paralyzed.");
        }

        return basePower;
    }

    public void eats() {
        System.out.println("Electric Pokémon's favourite snack are watmel berries.");
    }
    public void speaks() {
        System.out.println("Electric Pokémon says: Zzzzzzzt-bzzrr ");
    }
}
