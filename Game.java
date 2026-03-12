public class Game{
    private String name;
    private int happinessIncrease; 
    private int weightLosse;
    public Game(String name,  int happinessIncrease, int weightLosse){
        this.name = name;
        this.happinessIncrease=happinessIncrease;
        this.weightLosse=weightLosse;
    }
    public int weightAmount() {
        return weightLosse;
    }
    public int happinessAmount() {
        return happinessIncrease;
    }
    public String getName() {
      return name;
  }
}
