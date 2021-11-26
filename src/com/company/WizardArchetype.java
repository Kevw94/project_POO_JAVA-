package com.company;


// -------------------- ADD WIZARD -------------------------

class WizardArchetype extends DefaultArchetype {
int finalDamage;
    protected WizardArchetype(String name,
                          int lifePoint,
                          int damage,
                          int initiative) {
        super(name, lifePoint, damage, initiative);

    }

    public int getMagicDamage() {
        return MagicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        MagicDamage = magicDamage;
    }

    protected int MagicDamage;



    protected WizardArchetype(){
    }


    public String toString(){
        return "Wizard Archetype" + "\n" +
                "name =  " + name + "\n" +
                "Lifepoint = " + lifePoint + "\n" +
                "Damage = " + damage + "\n" +
                "Initiative = " + initiative + "\n" +
                "Magic damage = " + MagicDamage;
    }
    public int getDamages(){
        finalDamage = damage + MagicDamage;
        MagicDamage = MagicDamage / 2;
        return finalDamage;
    }

    public int takeDamages(int damage){
        lifePoint = lifePoint - damage;
        return lifePoint;
    }
    public void wizardArchetype(WizardArchetype wizardArchetype) {
        System.out.println(wizardArchetype);
    }
}

