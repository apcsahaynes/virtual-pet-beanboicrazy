public class Food{
    private String name;
    private int energyIncrease;
    private int happinessIncrease; 
    private int weightGain;
    public Food(String name, int energyIncrease, int happinessIncrease, int weightGain){
        this.name = name;
        this.energyIncrease = energyIncrease;
        this.happinessIncrease=happinessIncrease;
        this.weightGain=weightGain;
    }
    public int energyAmount() {
        return energyIncrease;
    }
    public int weightAmount() {
        return weightGain;
    }
    public int happinessAmount() {
        return happinessIncrease;
    }
    public String getName() {
      return name;
  }
}
