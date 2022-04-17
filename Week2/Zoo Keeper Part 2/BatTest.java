public class BatTest {
    public static void main(String[] args){
        Bat bat = new Bat();

        // Create a BatTest class to attack 3 towns, eat two humans and fly twice
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
    }
}