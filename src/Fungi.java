class Fungi {

    String mushroomName;

     boolean poisonous;

     int bacteriaAge;

    Fungi(String mushroomName, boolean poisonous, int bacteriaAge) {
        this.mushroomName = mushroomName;
        this.poisonous = poisonous;
        this.bacteriaAge = bacteriaAge;
    }


    void decay(int factor) {
        this.bacteriaAge *= factor;
    }
}