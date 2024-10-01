package main;

import Pokemon.*;

public class Main {
    public static void main (String[] args) {

        ElectricPokemon zapdos = new ElectricPokemon(162, 52, "Zapdos", 13, 40.0, 238);
        zapdos.eats();
        zapdos.speaks();

        zapdos.theChosenOne();
    }
}
