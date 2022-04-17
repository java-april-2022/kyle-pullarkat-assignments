public class Bat extends Energy {

    // have a bat that can fly eathumans and attacktown, and has default energy of 300
    public Bat(){
        super(300);
    }
    // Bat Flys
    void fly(){
        System.out.println(" Shwoooo");
        energyLevel -= 50;
        displayEnergy();
    }
    // Bat Eats Humans and gains energy
    void eatHumans(){
        System.out.println(" increased energy by 25 ");
        energyLevel += 25;
        displayEnergy();
    }
    // Bat attacks town
    void attackTown(){
        System.out.println(" Bat attacks town and theres fire everywhere, -100 Energy");
        energyLevel -= 100;
        displayEnergy();
    }
}