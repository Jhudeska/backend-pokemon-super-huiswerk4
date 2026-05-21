public class Main {

    public static void main(String[] args) {

        WaterPokemon waterPokemon = new WaterPokemon("squirtle", "salmon", "squirell squirell ");
        GrassPokemon grassPokemon = new GrassPokemon("bullbasuar", "salmon", "squirell squirell");
        FirePokemon firePokemon = new FirePokemon("charmander", "salmon", "squirell squirell ");
        ElectricPokemon electricPokemon = new ElectricPokemon("pikachu", "salmon", "squirell squirell ");
        FireStonePokemon fireStonePokemon = new FireStonePokemon("testing", "testing",  "SandStonePokemon", "sandstone", "blue");

        waterPokemon.setLevel(30); //private field
        waterPokemon.setHp(45);
        waterPokemon.surf();
        waterPokemon.sleep();
        waterPokemon.sendOutPokeball();

        grassPokemon.setLevel(130);
        grassPokemon.rainDance();
        grassPokemon.sleep();
        grassPokemon.sendOutPokeball(); //attack function

        firePokemon.setLevel(89);
        firePokemon.eats();
        firePokemon.sleep();
        firePokemon.sendOutPokeball();

        electricPokemon.setLevel(300);
        electricPokemon.thunder();
        electricPokemon.sleep();
        electricPokemon.sendOutPokeball();

        fireStonePokemon.transformToStone();
        fireStonePokemon.sleep();

    }

}