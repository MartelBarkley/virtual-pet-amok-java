package pets_amok;

public class OrganicDog extends OrganicPet implements walkable{

    public OrganicDog(String name, String description, int happinessLevel, int overallHealthLevel,int hungerLevel, int wasteLevel, int thirstLevel, int boredomLevel) {
        super(name, description, happinessLevel, overallHealthLevel, hungerLevel, wasteLevel, thirstLevel,boredomLevel);

    }

    public void cleanCages(){
        wasteLevel = 0;

    }

    @Override
    public void feedPet() {
        hungerLevel -=10;
        thirstLevel +=5;
        wasteLevel +=5;
    }

    @Override
    public void waterPet() {
        thirstLevel -=10;
        wasteLevel +=2;

    }

    public void play(){
        happinessLevel += 10;
        hungerLevel += 20;
        thirstLevel +=30;
        overallHealthLevel += 15;
        boredomLevel -= 15;

    }

    @Override
    public void tick() {
        happinessLevel +=1;
        hungerLevel +=1;
        thirstLevel +=1;
        overallHealthLevel +=1;
        boredomLevel +=1;

    }

    @Override
    public void walk() {
        happinessLevel -=5;
        hungerLevel +=5;
        happinessLevel +=10;
        overallHealthLevel +=5;
    }
}