public class ElectricPokemon extends Pokemon{


    public ElectricPokemon(String name) {
        super(name);
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public ElectricPokemon(String name, String food, String sound) {
        super(name, food, sound);
    }

    @Override
    void eats() {

    }

    @Override
    void speaks() {

    }

    @Override
    void thunderPunch() {

    }

    @Override
    void surf() {

    }

    @Override
    void leafStorm() {

    }

    @Override
    void inferno() {

    }

    @Override
    void electroBall() {

    }

    @Override
    void pyroBall() {

    }

    @Override
    void solarBeam() {

    }

    @Override
    void hydroPump() {

    }

    @Override
    void thunder() {
        System.out.println("Thunder, you better watch out!");
    }

    @Override
    void hydroCanon() {

    }

    @Override
    void fireLash() {

    }

    @Override
    void leechSeed() {

    }

    @Override
    void voltTackle() {

    }

    @Override
    void rainDance() {

    }

    @Override
    void leaveBlade() {

    }

    @Override
    void flameThrower() {

    }

    void sleep(){
        System.out.println( getName()  + " sleep.");
    }

    void sendOutPokeball(){
        System.out.println( getName() + " i choose you " + getLevel());
    }

    // TODO: 2 methodes, 1 Override methode en getters & setters
}