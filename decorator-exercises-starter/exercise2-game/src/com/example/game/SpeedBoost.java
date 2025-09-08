package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int speedIncrease;

    public SpeedBoost(Character character, int speedIncrease) {
        super(character);
        this.speedIncrease = speedIncrease;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + speedIncrease;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }
}
