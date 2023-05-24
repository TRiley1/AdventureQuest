package players;

import players.weapons.Weapon;

import java.util.ArrayList;

public abstract class Player implements IHealable{
    private String name;
    private int healthPoint;
    private ArrayList<Weapon> treasures;
    private ArrayList<Weapon> weapons;
    private Weapon holdWeapon;

    public Player(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.treasures = new ArrayList<>();
        this.weapons = new ArrayList<>();
        this.holdWeapon = null;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    public void addWeapon(Weapon weapon) {
        getWeapons().add(weapon);
    }

    public Weapon holdWeapon() {
        return holdWeapon;
    }

    public Weapon getHoldWeapon() {
        return holdWeapon;
    }
    public void selectWeapon(int num){
        this.holdWeapon = weapons.get(num);
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
