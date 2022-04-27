package pets_amok;

public class RobotCat extends RoboticPet{

    public RobotCat(String name, String description, int happiness,int overallHealth, int oilLevel) {
        super(name, description, happiness, overallHealth, oilLevel);

    }

    @Override
    public void oilPet() {
        oilLevel +=10;

    }

    @Override
    public void tick() {
        oilLevel -=2;
        overallHealthLevel -=2;
        happinessLevel -=2;

    }
}

