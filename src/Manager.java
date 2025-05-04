import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private List<Pet> pets;

    public Manager(){
        this.pets = new ArrayList<>();
    }

    public void addPet(Scanner scan, int numOfPet) {
        scan.nextLine();
        System.out.println("Give name: ");
        String name = scan.nextLine();
        int years;
        while (true) {
            try {
                System.out.println("Give age in years (type 0 if younger than 1 year): ");
                years = scan.nextInt();
                if (years < 0) {
                    System.out.println("Age cannot be negative.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scan.nextLine();
            }
        }

        int months = 0;
        if (years == 0) {
            while (true) {
                try {
                    System.out.println("Give age in months: ");
                    months = scan.nextInt();
                    if (months < 0) {
                        System.out.println("Age cannot be negative.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input.");
                    scan.nextLine();
                }
            }
        }
        scan.nextLine();

        System.out.println("Give breed: ");
        String breed = scan.nextLine();

        String gender = "";
        while (true) {
            System.out.println("Give gender:\n1 - Female\n2 - Male\nGive a number: ");
            String input = scan.nextLine();

            if (input.equals("1")) {
                gender = "Female";
                break;
            } else if (input.equals("2")) {
                gender = "Male";
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }

        String size = "";
        while (true) {
            System.out.println("Give size:\n1 - Small\n2 - Medium\n3 - Large\nGive a number: ");
            String input = scan.nextLine();

            if (input.equals("1")) {
                size = "Small";
                break;
            } else if (input.equals("2")) {
                size = "Medium";
                break;
            } else if (input.equals("3")) {
                size = "Large";
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }

        switch (numOfPet){
            case 1:{
                boolean isTrained;
                while(true){
                    System.out.println("Is it trained?: \n1 - Yes \n2 - No\nGive a number:");
                    String input = scan.nextLine();

                    if (input.equals("1")) {
                        isTrained = true;
                        break;
                    } else if (input.equals("2")) {
                        isTrained = false;
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }

                Pet pet = new Dog(name, months, years, breed, gender, size, isTrained);
                pets.add(pet);
                pet.makeSound();
                break;
            }

            case 2:{
                Pet pet = new Cat(name, months, years, breed, gender, size);
                pets.add(pet);
                pet.makeSound();
                break;
            }

            case 3:{
                boolean canTalk;
                while(true) {
                    System.out.println("Can it talk?: \n1 - Yes \n2 - No\nGive a number:");
                    String input = scan.nextLine();

                    if (input.equals("1")) {
                        canTalk = true;
                        break;
                    } else if (input.equals("2")) {
                        canTalk = false;
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }

                Pet pet = new Parrot(name, months, years, breed, gender, size, canTalk);
                pets.add(pet);
                pet.makeSound();
                break;
            }
            case 4:{
                Pet pet = new Rabbit(name, months, years, breed, gender, size);
                pets.add(pet);
                pet.makeSound();
                break;
            }
        }
    }

    public void ShowAllPets(){
        for(Pet pet: pets){
            System.out.println(pet);
        }
    }

    public void RemovePet(Scanner scan) {
        System.out.println("Give the exact pet name:");
        String nameToRemove = scan.nextLine();

        List<Pet> matchedPets = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.name.equalsIgnoreCase(nameToRemove)) {
                matchedPets.add(pet);
            }
        }

        if (matchedPets.isEmpty()) {
            System.out.println("No pet found with the name \"" + nameToRemove + "\".");
            return;
        }

        if (matchedPets.size() == 1) {
            pets.remove(matchedPets.get(0));
            System.out.println("Pet \"" + nameToRemove + "\" has been removed.");
        } else {
            System.out.println("Multiple pets found with the name \"" + nameToRemove + "\":");
            for (int i = 0; i < matchedPets.size(); i++) {
                System.out.println((i + 1) + ". " + matchedPets.get(i));
            }

            int choice;
            while (true) {
                try {
                    System.out.print("Enter the number of the pet to remove: ");
                    choice = Integer.parseInt(scan.nextLine());
                    if (choice >= 1 && choice <= matchedPets.size()) {
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }

            Pet toRemove = matchedPets.get(choice - 1);
            pets.remove(toRemove);
            System.out.println("Pet \"" + toRemove.name + "\" has been removed.");
        }
    }

    public void searchByName(Scanner scan) {
        System.out.println("Give pet name:");
        String name = scan.nextLine();

        for(Pet pet: pets){
            if(pet.name.toLowerCase().trim().contains(name.toLowerCase().trim())){
                System.out.println(pet);
            }
        }
    }

}
