package players.fighters;

public class Knight extends Fighter{

    private int armour;
    public Knight(String name, int healthPoint, int armour) {

        super(name, healthPoint);
        this.armour = armour;
    }
    public void takeDamage(int damage){
        if(this.armour >= damage){
            return;
        }
        this.setHealthPoint(this.getHealthPoint() - (damage-armour));
    }
}
