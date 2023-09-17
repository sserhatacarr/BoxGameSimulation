// Ring class to represent the boxing ring where the match happens
public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Method to start the match
    public void Run() {
        if (checkWeight()) {
            // Check the probability of who starts the fight
            if (Math.random() < 0.5) {
                System.out.println(f1.name + " will start the fight!");
                while (f1.health > 0 && f2.health > 0) {
                    // Fight round
                    System.out.println("======== NEW ROUND ===========");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            } else {
                System.out.println(f2.name + " will start the fight!");
                while (f1.health > 0 && f2.health > 0) {
                    // Fight round
                    System.out.println("======== NEW ROUND ===========");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }

        } else {
            System.out.println("Weights of the fighters do not match.");
        }
    }

    // Method to check if the weights of the fighters are suitable for the match
    public boolean checkWeight() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    // Method to check if there's a winner
    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("The winner is: " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("The winner is: " + f1.name);
            return true;
        }
        return false;
    }

    // Method to print the current scores
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }

}
