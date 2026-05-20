public class Main {

    public static void main(String[] args) {
        WaterPokemon waterPokemon = new WaterPokemon("squirtle");
        GrassPokemon grassPokemon = new GrassPokemon("bullbasuar");
        FirePokemon firePokemon = new FirePokemon("charmander");
        ElectricPokemon electricPokemon = new ElectricPokemon("pikachu");

        waterPokemon.surf();
        waterPokemon.sleep();
        grassPokemon.rainDance();
        firePokemon.eats();
        electricPokemon.thunder();

    }

}