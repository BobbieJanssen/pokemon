package Pokemon;

abstract class Pokemon {
    private String name;
    private int level;
    private double hp;
    private double xp;

    public abstract void eats();
    public abstract void speaks();

    public Pokemon (String name, int level, double hp, double xp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
    }

    public void setName(String NewName) {
        name = NewName;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int newLevel) {
        level = NewLevel;
    }

    public Int getLevel() {
        return level;
    }

    public void setHp(double newHp) {
        hp = NewHp;
    }

    public double getHp() {
        return hp;
    }
    public void setXp(double newXp) {
        xp = NewXp;
    }

    public double getXp() {
        return name;
    }
}
