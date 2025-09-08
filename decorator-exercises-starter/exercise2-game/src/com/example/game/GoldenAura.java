package com.example.game;

public class GoldenAura extends CharacterDecorator {

    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public String getSprite() {
        return "golden(" + super.getSprite() + ")";
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2; // Small speed buff
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 5; // Small damage buff
    }

    @Override
    public void move() {
        System.out.println("Golden aura shines!");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Golden aura empowers attack!");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}
