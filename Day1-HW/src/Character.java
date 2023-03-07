public class Character {

    private String type;
    private int healthPoints;
    private int armor;
    private int attackPower;

    private int originalHP;

    // default constructor
    public Character(){
        this.type = null;
        this.healthPoints = 100;
        this.armor = 50;
        this.attackPower = 35;
    }


    public Character(String type, int hp, int a, int ap){
        this.type = type;
        this.healthPoints = hp;
        this.armor = a;
        this.attackPower = ap;
        this.originalHP = hp;
    }

    // unique attributes: weapon type or
    // spell power

    // getters & setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getOriginalHP() {
        return originalHP;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // methods
    public void takeDamage(int damageAmount) {
        if (damageAmount >= getArmor()){
            damageAmount -= getArmor();
            setArmor(0);
            if (damageAmount >= getHealthPoints()) {
                healthPoints = 0;
                System.out.println("Your character has fainted!");
            } else {
                healthPoints -= damageAmount;
            }
        } else {
            armor -= damageAmount;
        }
    }

    public void heal(int healAmount) {
        if (healAmount > originalHP) {
            setHealthPoints(originalHP);
        } else if ((healAmount < originalHP) && ((healAmount + getHealthPoints()) < originalHP)){
            healthPoints += healAmount;
        }
    }
}
