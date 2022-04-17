public class Energy {
    int energyLevel = 100;

    int displayEnergy(){
        System.out.printf("Energy level: %s\n", energyLevel);
        return energyLevel;
    }
    public Energy(int energyLevel){
        this.energyLevel = energyLevel;
    }
}