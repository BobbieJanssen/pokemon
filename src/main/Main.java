package main;

import Pokemon.*;

public class Main {
    public static void main (String[] args) {

        ElectricPokemon zapdos = new ElectricPokemon(1.62, 52, "Zapdos", 65, 112.0, 245);
        FirePokemon charizard = new FirePokemon(1.71, 90.5, "Charizard", 65, 130.0, 296);
        GrassPokemon venusaur = new GrassPokemon(2.12, 100, "Venusaur", 65, 128.0, 230 );
        WaterPokemon blastoise = new WaterPokemon(1.6, 85.5, "Blastoise", 65, 145, 266);

        zapdos.eats();
        zapdos.speaks();
        zapdos.theChosenOne();

        charizard.eats();
        charizard.speaks();
        charizard.theChosenOne();

        venusaur.eats();
        venusaur.speaks();
        venusaur.theChosenOne();

        blastoise.eats();
        blastoise.speaks();
        blastoise.theChosenOne();


        zapdos.boltStrike(charizard, true);
        zapdos.wildCharge(venusaur, true);
        charizard.flameThrower(blastoise);
        charizard.flameThrower(venusaur);
        venusaur.seedFlare(zapdos, false);
        venusaur.grassWhistle(blastoise, false, false);
        blastoise.rainDance(charizard, true, false);
        blastoise.muddyWater(zapdos, true);
    }
}
