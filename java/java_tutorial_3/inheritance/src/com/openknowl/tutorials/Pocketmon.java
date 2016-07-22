package com.openknowl.tutorials;

abstract public class Pocketmon {
    private int id;
    private String name;
    private int level;
    protected int hp;
    protected int damage;

    abstract public void attack(Pocketmon target);

    abstract public void eat();

    public void damaged(int damage) {
        this.hp -= damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Pocketmon(String name) {
        this.name = name;
        this.level = 0;
    }

    @Override
    public String toString() {
        return "이름 : " + this.name + " / 체력 : " + this.hp;
    }
}
