package Pokemon;

abstract class Pokemon {
    private String name;
    private int level;
    private double hp;
    private int xp;

    public abstract void eats();
    public abstract void speaks();

    public void theChosenOne() {
        System.out.println("I Choose you!");
    }

    public Pokemon (String name, int level, double hp, int xp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    public void setLevel(int newLevel) {
        this.level = newLevel;
    }
    public int getLevel() {
        return level;
    }

    public void setHp(int newHp) {
        this.hp = newHp;
    }
    public double getHp() {
        return hp;
    }

    public void setXp(int newXp) {
        this.xp = newXp;
    }
    public int getXp() {
        return xp;
    }
}
