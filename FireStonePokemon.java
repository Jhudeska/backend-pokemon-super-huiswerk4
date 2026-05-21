public class FireStonePokemon extends FirePokemon {
        String type;
        String color;

    public FireStonePokemon(String charmander, String salmon, String name, String type, String color) {
        super(charmander, salmon, name);
        this.type = type;
        this.color = color;
    }

    public void transformToStone(){
        System.out.println("Pokemon transform to " + this.type + " stone. The color of the pokemon is " + this.color +
                "and make same sound like the water pokemons" + this.sound);
    }
}
