abstract class Pokemon {
    String name;
    private int level;
    private int hp;
    String food;
    String sound;

    public Pokemon(String name){
        this.name = name;
    }

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    abstract  void eats();
    abstract  void speaks();
    abstract  void thunderPunch();
    abstract  void surf();
    abstract  void leafStorm();
    abstract  void inferno();
    abstract  void electroBall();
    abstract  void pyroBall();
    abstract  void solarBeam();
    abstract  void hydroPump();
    abstract  void thunder();;
    abstract  void hydroCanon();
    abstract  void fireLash();
    abstract  void leechSeed();
    abstract  void voltTackle();
    abstract  void rainDance();
    abstract  void leaveBlade();
    abstract  void flameThrower();





}