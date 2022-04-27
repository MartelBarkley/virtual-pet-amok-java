package pets_amok;

public abstract class OrganicPet extends VirtualPet{

    protected int hungerLevel;
    protected int wasteLevel;
    protected int thirstLevel;
    protected int boredomLevel;



    public OrganicPet(String name, String description, int happinessLevel, int overallHealthLevel){
        super(name, description, happinessLevel, overallHealthLevel);
        this.hungerLevel = 100;
        this.wasteLevel = 0;
        this.thirstLevel = 100;
        this.boredomLevel = 50;
    }

    public OrganicPet(String name, String description, int happinessLevel, int overallHealthLevel,int hungerLevel, int wasteLevel, int thirstLevel, int boredomLevel) {
        super(name, description, happinessLevel, overallHealthLevel);
        this.hungerLevel = hungerLevel;
        this.wasteLevel = wasteLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getHungerLevel(){
        return hungerLevel;
    }

    public int getWasteLevel(){
        return wasteLevel;
    }

    public int getThirstLevel(){
        return thirstLevel;
    }

    public int getBoredomLevel(){
        return boredomLevel;
    }

    public abstract void feedPet();

    public abstract void waterPet();

    public abstract void play();

}