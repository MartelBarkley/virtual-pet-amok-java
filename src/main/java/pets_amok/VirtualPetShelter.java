package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> myPets = new HashMap<>();

    public void add(VirtualPet petToAdd) {
        myPets.put(petToAdd.getName(), petToAdd);
    }

    public VirtualPet findPet(String petName) {
        return myPets.get(petName);
    }

    public void adopt(VirtualPet petToRemove) {
        myPets.remove(petToRemove.getName(), petToRemove);
    }


    public void feedAllPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feedPet();
            }
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).waterPet();
            }
        }
    }

    public void walkAllPets() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof walkable) {
                ((walkable) pet).walk();
            }
        }
    }

    public void oilAllRobots() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oilPet();
            }
        }
    }

    public void cleanAllCages() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCages();
            }
        }
    }

    public void showPetStats() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicCat) {
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Hunger Level: " + ((OrganicCat) pet).getHungerLevel() + "|" + " Waste Level: " + ((OrganicCat) pet).getWasteLevel() + "|" + " Thirst Level: " + ((OrganicCat) pet).getThirstLevel() + "|" + " Boredom Level: " + ((OrganicCat) pet).getBoredomLevel());
            } else if (pet instanceof OrganicDog) {
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" +" Health Level: " + pet.getOverallHealthLevel() + "|" + " Hunger Level: " + ((OrganicDog) pet).getHungerLevel() + "|" + " Waste Level: " + ((OrganicDog) pet).getWasteLevel() + "|" + " Thirst Level: " + ((OrganicDog) pet).getThirstLevel() + "|" + " Boredom Level: " + ((OrganicDog) pet).getBoredomLevel());
            } else if (pet instanceof RobotDragon) {
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotDragon) pet).getOilLevel());
            }else if (pet instanceof RobotDog) {
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotDog) pet).getOilLevel());
            }else if (pet instanceof RobotCat){
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotCat) pet).getOilLevel());


            }
        }
    }


    public void cleanAllLitterBoxes() {
        for (VirtualPet pet : myPets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
    }

    public void showAllOrganicDogsStats(){
        for (VirtualPet pet : myPets.values()){
            if (pet instanceof OrganicDog) {
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Hunger Level: " + ((OrganicDog) pet).getHungerLevel() + "|" + " Waste Level: " + ((OrganicDog) pet).getWasteLevel() + "|" + " Thirst Level: " + ((OrganicDog) pet).getThirstLevel() + "|" + " Boredom Level: " + ((OrganicDog) pet).getBoredomLevel());
            }
        }
    }

    public void showAllOrganicCatsStats(){
        for (VirtualPet pet : myPets.values()){
            if (pet instanceof OrganicCat){
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Hunger Level: " + ((OrganicCat) pet).getHungerLevel() + "|" + " Waste Level: " + ((OrganicCat) pet).getWasteLevel() + "|" + " Thirst Level: " + ((OrganicCat) pet).getThirstLevel() + "|" + " Boredom Level: " + ((OrganicCat) pet).getBoredomLevel());
            }
        }
    }

    public void showAllRoboticDogs(){
        for (VirtualPet pet : myPets.values()){
            if (pet instanceof RobotDog){
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotDog) pet).getOilLevel());
            }
        }
    }

    public void showAllRoboticCats(){
        for (VirtualPet pet : myPets.values()){
            if (pet instanceof RobotCat){
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotCat) pet).getOilLevel());
            }
        }
    }

    public void showAllRobotDragons(){
        for (VirtualPet pet : myPets.values()){
            if (pet instanceof RobotDragon){
                System.out.println("Name: " + pet.getName() + "|" + " Description: " + pet.getDescription() + "|" + " Happiness Level: " + pet.getHappinessLevel() + "|" + " Health Level: " + pet.getOverallHealthLevel() + "|" + " Oil Level: " + ((RobotDragon) pet).getOilLevel());
            }
        }
    }

    public void removePet(String pet) {
        myPets.remove(pet);
    }

    public Collection<VirtualPet> getAllPets(String petToRemove) {
        return myPets.values();
    }
}
