package pets_amok;

public abstract class RoboticPet extends VirtualPet{

    protected int oilLevel;

    public RoboticPet(String name, String description, int happinessLevel,int overallHealthLevel, int oilLevel) {
        super(name, description, happinessLevel,overallHealthLevel);
        this.oilLevel = oilLevel;


    }


    public int getOilLevel() {
        return oilLevel;
    }


    public abstract void oilPet();

}
