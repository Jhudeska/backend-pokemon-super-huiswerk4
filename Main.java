public class Main {

    public static void main(String[] args) {

        WaterPokemon waterPokemon = new WaterPokemon("squirtle", "salmon", "squirell squirell ");
        GrassPokemon grassPokemon = new GrassPokemon("bullbasuar", "salmon", "squirell squirell");
        FirePokemon firePokemon = new FirePokemon("charmander", "salmon", "squirell squirell ");
        ElectricPokemon electricPokemon = new ElectricPokemon("pikachu", "salmon", "squirell squirell ");

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

        //TODO: I forgot to create a home work branch, forced it with this todo to create branchg
    }

}