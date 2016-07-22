package com.openknowl.tutorials;

public class Raichu extends Pikachu {

    public Raichu() {
        super("라이츄");
        this.hp = 200;
        this.damage = 200;
    }

    @Override
    public void attack(Pocketmon target) {
        target.damaged(this.damage);
    }

    @Override
    public void eat() {
        this.hp += 1;
    }

}
