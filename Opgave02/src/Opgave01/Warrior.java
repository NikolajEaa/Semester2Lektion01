package Opgave01;

import java.util.ArrayList;

public class Warrior extends Character{
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name, level);
        this.weapons = weapons;
    }
    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
