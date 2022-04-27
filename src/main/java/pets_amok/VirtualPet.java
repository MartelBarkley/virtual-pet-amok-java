package pets_amok;

abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int happinessLevel;
    protected int overallHealthLevel;

    public VirtualPet(String name, String description, int happinessLevel,int overallHealthLevel){
        this.name = name;
        this.description = description;
        this.happinessLevel = happinessLevel;
        this.overallHealthLevel = overallHealthLevel;

    }
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getHappinessLevel(){
        return happinessLevel;
    }

    public int getOverallHealthLevel(){
        return overallHealthLevel;
    }

    public abstract void tick();

}
