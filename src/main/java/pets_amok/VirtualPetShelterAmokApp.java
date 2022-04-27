package pets_amok;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetShelterAmokApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter virtualPet = new VirtualPetShelter();

        OrganicCat organicCat = new OrganicCat("Garfield", "I'm Hungry", 15, 75, 65, 20, 65, 25);
        OrganicDog organicDog = new OrganicDog("Sam", "Sam I Am", 75, 55, 100, 35, 45, 100);
        RobotDragon robotDragon = new RobotDragon("Dra-gon", "Ruff Riddas", 100, 50, 65);
        RobotDog robotDog = new RobotDog("Rover", "Take me to your leader", 100, 55, 85);
        RobotCat robotCat = new RobotCat("Grumpy", "What Do You Want?", 45, 100, 55);

        virtualPet.add(organicCat);
        virtualPet.add(organicDog);
        virtualPet.add(robotDragon);
        virtualPet.add(robotDog);
        virtualPet.add(robotCat);

        String userChoice;

        System.out.println("Welcome to Star Island");
        System.out.println();
        System.out.println("Here your imagine will run wild..... Lets Get Started");
        System.out.println();
        System.out.println("Here are the pets you get to choose from");
        System.out.println();

        virtualPet.showPetStats();
        System.out.println();

        do {
//            System.out.println("Welcome to Star Island");
//            System.out.println();
//            System.out.println("Here your imagine will run wild..... Lets Get Started");
//            System.out.println();
//            System.out.println("Here are the pets you get to choose from");
//            System.out.println();
//
//            virtualPet.showPetStats();

            System.out.println("To Feed Organic Pets press 1");
            System.out.println("To Play with Organic Pets press 2 ");
            System.out.println("To Water Organic Pets press 3");
            System.out.println("To Clean Organic Cat Litter Box press 4");
            System.out.println("To Clean Organic Dog Cages press 5");
            System.out.println("To Walk Organic Dog Press 6");
            System.out.println("To Oil Robotic Pet press 7");
            System.out.println("To adopt a pet press 8");
            System.out.println("To admit a pet to the shelter press 9");
            System.out.println("To Exit Press 10");


            userChoice = input.nextLine();

            while (!userChoice.equals("10")) {
                if (userChoice.equals("1")) {
                    System.out.println("Lets Feed Your Pets...Garfield will be so happy");
                    System.out.println();
                    virtualPet.feedAllPets();

                    System.out.println("Your Pets Are Full");
                    System.out.println();
                    virtualPet.showAllOrganicCatsStats();
                    virtualPet.showAllOrganicDogsStats();
                    System.out.println();
                    break;

                } else if (userChoice.equals("2")) {
                    System.out.println("Lets Play with your Organic Pets");
                    System.out.println(" YAY...... there so happy!!!!");
                    System.out.println();
                    organicCat.play();
                    organicDog.play();

                    System.out.println("Your pets are good and tired now");
                    System.out.println();
                    virtualPet.showAllOrganicDogsStats();
                    virtualPet.showAllOrganicCatsStats();
                    System.out.println();
                    break;

                } else if (userChoice.equals("3")) {
                    System.out.println("Your Pets look a little thirsty...... Lets give them some water");
                    virtualPet.waterAllPets();

                    System.out.println("Mission Accomplished");
                    System.out.println();
                    virtualPet.showAllOrganicCatsStats();
                    virtualPet.showAllOrganicDogsStats();
                    System.out.println();
                    break;

                } else if (userChoice.equals("4")) {
                    System.out.println("Your cats litter box is getting full, lets clean it");
                    virtualPet.cleanAllLitterBoxes();

                    System.out.println("Mission Accomplished");
                    System.out.println();
                    virtualPet.showAllOrganicCatsStats();
                    System.out.println();
                    break;

                } else if (userChoice.equals(("5"))) {
                    System.out.println("Your dogs cage is getting full and needs to be cleaned, lets clean it");
                    virtualPet.cleanAllCages();

                    System.out.println("Mission Accomplished");
                    System.out.println();
                    virtualPet.showAllOrganicDogsStats();
                    System.out.println();
                    break;

                } else if (userChoice.equals("6")) {
                    System.out.println("Lets take your dog for a walk");
                    virtualPet.walkAllPets();

                    System.out.println("Mission Accomplished");
                    System.out.println();
                    virtualPet.showPetStats();
                    System.out.println();
                    break;
                }else if (userChoice.equals("7")){
                    System.out.println("I think your robots can use some oil");
                    virtualPet.oilAllRobots();

                    System.out.println("Mission Accomplished");
                    System.out.println();
                    virtualPet.showAllRoboticDogs();
                    virtualPet.showAllRobotDragons();
                    virtualPet.showAllRoboticCats();
                    System.out.println();
                    break;
                }else if (userChoice.equals("8")){
                    System.out.println("I see your looking to adopt...");
                    System.out.println("Which pet would you like to adopt");


                    String petToAdoptName = input.nextLine();
                    VirtualPet petToAdopt = virtualPet.findPet(petToAdoptName);
                    virtualPet.adopt(petToAdopt);

                    System.out.println("Congratulations You just Adopted: " + petToAdoptName);
                    System.out.println();
                    break;

                }else if (userChoice.equals("9")){
                    System.out.println("OK so it looks like you want to add a pet to our shelter");
                    System.out.println("Whats your pets name?");
                    String petName = input.nextLine();
                    System.out.println("Describe your pet to us in a few words");
                    String petDescription = input.nextLine();
                    System.out.println("What type of pet is it?");
                    System.out.println("1. Organic Dog");
                    System.out.println("2. Organic Cat");
                    System.out.println("3. Robotic Dog");
                    System.out.println("4. Robotic Cat");
                    input.nextLine();
                    OrganicCat organicCat1 = new OrganicCat(petName, petDescription,100,45,78,95,20,64);
                    OrganicDog organicDog1 = new OrganicDog(petName, petDescription,55,80,35,100,50,65);
                    RobotDog robotDog1 = new RobotDog(petName, petDescription,85,95,65);
                    RobotCat robotCat1 = new RobotCat(petName, petDescription,20,35,74);
                    virtualPet.add(organicCat1);
                    virtualPet.add(organicDog1);
                    virtualPet.add(robotDog1);
                    virtualPet.add(robotCat1);
                    System.out.println("We have no problem taking in " + petName + " ,They are in good hands");
                    System.out.println();
                    break;


                }
            }

        }while (!userChoice.equals("10"));

    }
}
