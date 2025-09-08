package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();
        System.out.println();

        // a) Base + SpeedBoost + DamageBoost
        System.out.println("--- Base + SpeedBoost + DamageBoost ---");
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        buffed.move();
        buffed.attack();
        System.out.println();

        // b) Add GoldenAura
        System.out.println("--- Add GoldenAura ---");
        Character shiny = new GoldenAura(buffed);
        shiny.move();
        shiny.attack();
        System.out.println();

        // c) Remove GoldenAura by recomposing
        System.out.println("--- Remove GoldenAura ---");
        Character withoutAura = buffed; // removal by recomposition
        withoutAura.move();
        withoutAura.attack();
    }
}
