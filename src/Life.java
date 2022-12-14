class Life{
    public static void main(String[] args) {
        // Create a Seed object and initialize its properties
        Seed seed = new Seed();

        // Create a Time object and initialize its property
        Time time = new Time(0);

        // Create a Growth object and initialize its properties
        Growth growth = new Growth(0, 0, 0);

        // Start the growth process by calling the spawn() method on the seed object
        seed.spawn();

        // Loop through the growth process for 10 days
        for (int i = 0; i < 10; i++) {
            // Increment the value of the days property in the Time object
            time.time();

            // Absorb nutrients by calling to absorb() method on the seed object
            seed.absorb();

            // Sprout the seed by calling the startSprouting() method on the seed object
            seed.startSprouting();

            // Increase the nutrient, water, and sun levels in the Growth object
            growth.nutrientLevel += 10;
            growth.waterLevel += 5;
            growth.sunLevel += 8;

            // Print the growth status after each day
            System.out.println("Day " + time.days + ": Growth status - Nutrient level: " + growth.nutrientLevel + ", Water level: " + growth.waterLevel + ", Sun level: " + growth.sunLevel);
        }

        // Create a Plant object and initialize its properties
        Plant plant = new Plant(seed.seedNameAnalyze, true, false, 0, 0, false);

        // Increase the maturity level of the plant
        plant.maturityLvl += 10;

        // Check if the plant is mature enough to produce fruit
        if (plant.maturityLvl >= 5) {
            plant.canFruiting = true;
        }

        // If the plant is capable of fruiting, produce fruit
        if (plant.canFruiting) {
            plant.fruitNumber += 5;
        }

        // Print the plant's current status
        System.out.println("Plant Name: " + plant.plantName);
        System.out.println("Leaves: Green - " + plant.leavesGreen + ", Red - " + plant.leavesRed);
        System.out.println("Maturity Level: " + plant.maturityLvl);
        System.out.println("Fruit Number: " + plant.fruitNumber);

        // Create a Fungi object and initialize its properties
        Fungi fungi = new Fungi("Mushroom", false, 10);

        // Call the decay() method on the fungi object to simulate the decay process
        fungi.decay(2);

        // Print the current status of the fungi
        System.out.println("Mushroom Name: " + fungi.mushroomName);
        System.out.println("Poisonous: " + fungi.poisonous);
        System.out.println("Bacteria Age: " + fungi.bacteriaAge);
    }




}