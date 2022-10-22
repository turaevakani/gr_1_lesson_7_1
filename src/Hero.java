public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeOfAttack;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfAttack() {
        return typeOfAttack;
    }

    public void setTypeOfAttack(String typeOfAttack) {
        this.typeOfAttack = typeOfAttack;
    }
}
