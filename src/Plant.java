class Plant {
     String plantName;


     boolean leavesGreen;

     boolean leavesRed;


    int maturityLvl;


    int fruitNumber;

    boolean canFruiting;

    // Constructor to initialize the properties of the Plant object
     Plant(String plantName, boolean leavesGreen, boolean leavesRed, int maturityLvl, int fruitNumber, boolean canFruiting) {
        this.plantName = plantName;
        this.leavesGreen = leavesGreen;
        this.leavesRed = leavesRed;
        this.maturityLvl = maturityLvl;
        this.fruitNumber = fruitNumber;
        this.canFruiting = canFruiting;
    }
}