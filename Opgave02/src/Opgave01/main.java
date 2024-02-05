package Opgave01;

public class main {
    public static void main(String[] args) {
        Barbarian barbarian = new Barbarian("Fofstelr", 1);
        Weapon weapon = new Weapon("longsword");
        barbarian.addWeapon(weapon);

        Wizard wizard = new Wizard("Orlemaex", 1);
        Spell spell = new Spell(150, Duration.INSTANTANEOUS);
        wizard.addSpell(spell);

        Ranged ranged = new Ranged("shortbow", 80);
        barbarian.addWeapon(ranged);




    }
}
