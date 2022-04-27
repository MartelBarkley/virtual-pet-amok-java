package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest = new VirtualPetShelter();
    RobotDog robotDog = new RobotDog("name","description",100,100,100);
    RobotCat robotCat = new RobotCat("name","description",100,100,100);
    OrganicCat organicCat = new OrganicCat("name","description",100,100,100,0,100,100);
    OrganicDog organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
    RobotDragon robotDragon = new RobotDragon("name","description",100,100,100);

    private String petToRemove;

    @Test
    public void addPetsToShelter(){
        underTest.add(robotDragon);
        VirtualPet foundPet = underTest.findPet("name");
        assertEquals("name", foundPet.getName());
    }

    @Test
    public void shouldBeAbleToFeedAllPets(){
        OrganicCat organicCat = new OrganicCat("name","description",100,100,100,0,100,100);
        OrganicDog organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
        underTest.feedAllPets();
        int organicDogHunger = organicDog.getHungerLevel();
        int organicCatHunger = organicCat.getHungerLevel();
        assertEquals(100, organicDogHunger);
        assertEquals(100, organicCatHunger);

    }

    @Test
    public void shouldBeAbleToWaterPet(){
        organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
        organicCat = new OrganicCat("name","description",100,100,100,0,100,100);
        underTest.waterAllPets();
        int organicDogThirst = organicDog.getThirstLevel();
        int organicCatThirst = organicCat.getThirstLevel();
        assertEquals(100, organicDogThirst);
        assertEquals(100, organicCatThirst);
    }

    @Test
    public void shouldBeAbleToWalkDogs(){
        organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
        underTest.walkAllPets();
        int organicDogWalk = organicDog.getHappinessLevel();
        assertEquals(100,organicDogWalk);


    }

    @Test
    public void shouldOilRoboticPets(){
        robotDragon = new RobotDragon("name","description",100,100,100);
        robotCat = new RobotCat("name","description",100,100,100);
        robotDog = new RobotDog("name","Description",100,100,100);
        underTest.oilAllRobots();
        int dragonOil = robotDragon.getOilLevel();
        int catOil = robotCat.getOilLevel();
        int dogOil = robotDog.getOilLevel();
        assertEquals(100, dragonOil);
        assertEquals(100,catOil);
        assertEquals(100, dogOil);
    }

    @Test
    public void shouldCleanDogCages(){
        organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
        underTest.cleanAllCages();
        int organicDogCageClean = organicDog.getWasteLevel();
        assertEquals(0, organicDogCageClean);
    }

    @Test
    public void shouldCleanAllLitterBoxes(){
        organicCat = new OrganicCat("name", "description",100,100,100,0,100,100);
        underTest.cleanAllLitterBoxes();
        int organicCatLitterBox = organicCat.getWasteLevel();
        assertEquals(0, organicCatLitterBox);
    }

//    @Test
//    public void shouldRemoveAfterAdoption(){
//        organicCat = new OrganicCat("name", "description",100,100,100,0,100,100);
//        organicDog = new OrganicDog("name","description",100,100,100,0,100,100);
//        underTest.add(organicCat);
//        underTest.add(organicDog);
//        underTest.removePet("name");
//        Collection<VirtualPet> allPets = underTest.getAllPets(petToRemove);
//        assertThat(allPets, contains(organicCat));
//    }

}