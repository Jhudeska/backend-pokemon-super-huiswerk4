public class FirePokemon extends Pokemon{


    public FirePokemon(String charmander, String salmon, String name) {
        super(name);
    }

    @Override
    void eats() {
        System.out.println("eats");
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

}