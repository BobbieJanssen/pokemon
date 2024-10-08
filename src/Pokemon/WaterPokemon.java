package Pokemon;

public class WaterPokemon extends Pokemon {
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

    public WaterPokemon(double height, double weight, String name, int level, int hp, int xp) {
        super(name, level, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    @Override public void theChosenOne() {
        System.out.println("I choose Water Pokémon " + getName() + "!\n");
    }

    public void rainDance(Pokemon target, boolean isFireType, boolean hasWateriumZ) {
        int speed = 1;

        if (hasWateriumZ) {
            System.out.println(getName() + " has Waterium Z, so the chosen Rain Dance becomes Z-Rain Dance. Speed is now " + (speed++) + " times as fast");
        } else {
            System.out.println(getName() + "'s chosen Rain Dance!");
        }

        double newHp = getHp() * 1.5;
        double opponentHp;

        if (isFireType) {
            opponentHp = target.getHp() * 0.5;
        } else {
            opponentHp = target.getHp() * 0.8;
        }
        System.out.println(getName() + "'s HP is now: " + opponentHp);
        System.out.println("The status is now " + newHp + " versus " + opponentHp + ".\n");
    }

    public int muddyWater(Pokemon target, boolean hasWateriumZ) {
        int basePower = hasWateriumZ ? 175 : 90;

        if (basePower == 175) {
            System.out.println(getName() + " has Waterium Z, so the chosen Muddy Water is now Hydro Vortex with base power: " + basePower);
        } else {
            System.out.println(getName() + "'s chosen Muddy Water!");
        }

        int round = 0;
        double accuracy = 1;
        while (round < 7) {
            round++;
            accuracy--;
            if (Math.random() < 0.3) {
                System.out.println("The target's accuracy is lowered. Accuracy is now: " + accuracy + "\n");
            } else {
                round++;
                System.out.println("The target's accuracy is not lowered.\n");
            }
        } return (int) (accuracy * 100);
        }

        public void eats () {
            System.out.println(getName() + " loves to eat crab, but became a pescatarian so now it's seaweed.\n");
        }

        public void speaks () {
            System.out.println(getName() + " says: gurgle gurle.\n");
        }
    }

