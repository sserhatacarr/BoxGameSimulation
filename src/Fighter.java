import java.util.Random;

// Fighter class to represent a fighter in the boxing match
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    // Method to handle a hit from this fighter to the opponent
    public int hit(Fighter foe) {
        System.out.println("-------------");
        System.out.println(this.name + " hit " + foe.name + " with " + this.damage + " damage.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged the incoming damage.");
            return foe.health;
        }
        if (foe.health - this.damage < 0)
            return 0;

        return this.health - this.damage;
    }

    // Method to simulate if the opponent dodges the hit
    public boolean dodge() {
        Random random = new Random();
        double randomValue = random.nextDouble() * 100; // Generating a random value between 0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
