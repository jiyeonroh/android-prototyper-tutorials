package com.openknowl.tutorials;

public class Pikachu extends Pocketmon implements Evolvable {

    public Pikachu() {
        super("피카츄");
        this.hp = 160;
        this.damage = 100;
    }

    public Pikachu(String name) {
        super(name);
    }

    @Override
    public void attack(Pocketmon target) {
        target.damaged(this.damage);
    }

    @Override
    public void eat() {
        this.hp += 1;
    }

    @Override
    public Pocketmon evolution() {
        return new Raichu();
    }
}
