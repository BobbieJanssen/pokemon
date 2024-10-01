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
        System.out.println("I choose Electric Pokémon " + getName() + "!\n");
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
            System.out.println(target.getName() + " is paralyzed!\n\n");
        } else {
            System.out.println(target.getName() + " is not paralyzed.\n\n");
        }

        return basePower;
    }

    public void wildCharge (Pokemon target, boolean hasElectriumZ) {
        int basePower = hasElectriumZ ? 175 : 90;

        if(hasElectriumZ) {
            System.out.println(target.getName() + " is using Wild Charge with Electrium Z! Wild Charge turns into Gigavolt Havoc with base power: " + basePower);
        } else {
            System.out.println(target.getName() + " is using Wild Charge! Base Power: " + basePower);
        }

        if(Math.random() < 0.8) {
            System.out.println("The attack cost you 100 HP damage. The status is now " + (target.getHp() - 100) + " versus " + (getHp() - 25));
        } else if (Math.random() < 0.6) {
            System.out.println("The attack cost you 80 HP damage. The status is now " + (target.getHp() - 80) + " versus " + (getHp() - 20));
        } else if (Math.random() < 0.4) {
            System.out.println("The attack cost you 60 HP damage. The status is now " + (target.getHp() - 60) + " versus " + (getHp() - 15));
        } else {
            System.out.println("The attack cost you 20 HP damage. The status is now " + (target.getHp() - 20) + " versus " + (getHp() - 5));
        }
    }

    public void eats() {
        System.out.println(getName() + "'s favourite snack are watmel berries.\n");
    }
    public void speaks() {
        System.out.println(getName() + " says: Zzzzzzzt-bzzrr.\n ");
    }
}
