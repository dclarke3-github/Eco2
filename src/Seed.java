import java.util.Scanner;

class Seed {

    String seedNameAnalyze;


     int collectNum;

    // Constructor to initialize the properties of the Seed object
       public Seed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name of the seed: ");
        this.seedNameAnalyze = scanner.nextLine();

        System.out.print("Enter the collection number of the seed: ");
        this.collectNum = scanner.nextInt();
    }

     void spawn() {
        System.out.println("The seed has spawned.");
    }

     void absorb() {
        System.out.println("The seed is absorbing nutrients.");
    }

     void startSprouting() {
        System.out.println("The seed is starting to sprout.");
    }
}
