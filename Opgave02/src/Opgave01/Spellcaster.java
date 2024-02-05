package Opgave01;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells;

    public Spellcaster (String name, int level) {
        super(name, level);
    }
    public void addSpell (Spell spell) {
        spells.add(spell);
    }
}
