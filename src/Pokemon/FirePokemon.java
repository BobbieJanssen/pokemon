package Pokemon;

public class FirePokemon extends Pokemon {
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

    public FirePokemon (double height, double weight, String name, int level, double hp, int xp) {
        super(name, level, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    @Override public void theChosenOne() {
        System.out.println("I choose Fire Pokémon " + getName() + "!");
    }

    public static int flameThrower(Pokemon target) {
    int basePower = 95;
        System.out.println("Flamethrower is used! Base Power: " + basePower);

        double newHp = target.getHp() - basePower;
        target.setHp((int) newHp);
        System.out.println(target.getName() + "'s HP is now: " + target.getHp());

        if (Math.random() < 0.1) {
            System.out.println("The target is burned!");
        } else {
            System.out.println("The target is not burned.");
        }

        return basePower;
    }

    public void shellTrap(Pokemon target, boolean hitByPhysicalMove, boolean hasFiriumZ) {
       if (hitByPhysicalMove) {
            int basePower = hasFiriumZ ? 200 : 150;
            System.out.println("Shell Trap was triggered! Base Power: " + basePower);

            double newHp = target.getHp() - basePower;
            target.setHp((int) newHp);
            System.out.println(target.getName() + "'s HP is now " + target.getHp());
        } else {
            System.out.println("The trap did not trigger.");
        }
    }

    public void eats() {
        System.out.println("Fire Pokemon loves to eat corn, but he keeps burning it into popcorn.");
    }
    public void speaks() {
        System.out.println("Fire Pokemon says: kriii kriii.");
    }
}
