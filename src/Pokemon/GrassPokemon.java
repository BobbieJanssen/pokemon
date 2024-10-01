package Pokemon;

public class GrassPokemon extends Pokemon {
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

    public GrassPokemon(double height, double weight, String name, int level, double hp, int xp) {
        super(name, level, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    @Override public void theChosenOne() {
        System.out.println("I choose Grass Pokémon " + getName() + "!");
    }

    public void seedFlare (Pokemon target, boolean hasGrassiumZ) {
        int basePower = hasGrassiumZ ? 190 : 100;

        if(hasGrassiumZ) {
            System.out.println(getName() + " is using Seed Flare with Grassium Z! It's turned into Bloom Doom with base power: " + basePower);
        } else {
            System.out.println(getName() + " is using Seed Flare! Base Power: " + basePower);
        }

        double newHp = target.getHp() - basePower;
        target.setHp((int) newHp);
        System.out.println(target.getName() + "'s HP is now " + target.getHp());

        if (Math.random() < 0.4) {
            System.out.println(getName() + "'s Special Defense is lowered by 2 stages!");
        } else {
            System.out.println(getName() + " is not affected by the Special Defense lowering effect");
        }
    }

    public void grassWhistle (Pokemon target, boolean hasInsomnia, boolean hasVitalSpirit) {
        if (hasInsomnia || hasVitalSpirit) {
            System.out.println(getName() + " cannot be put to sleep.");
        } else {
            System.out.println(getName() + " is put asleep for 3 rounds.");
        }
    }

    public void eats() {
        System.out.println("Grass Pokemon loves to eat moss-covered rocks and oran berries.");
    }

    public void speaks() {
        System.out.println("Grass Pokemon says: rustle rustle.");
    }
}