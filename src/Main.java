import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Options:" + "\n" + "1 - Add pet" + "\n" + "2 - Remove pet"
                    + "\n" + "3 - Show all pets" + "\n" + "4 - Find by name" + "\n" + "5 - Exit" + "\n" + "Give a number:");
            int option;
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
                continue;
            }
            switch (option) {
                case 1: {
                    Scanner scan = new Scanner(System.in);
                    int numOfPet;
                    while(true) {
                        try {
                            System.out.println("Which one?: " + "\n" + "1 - Dog" + "\n" + "2 - Cat"
                                    + "\n" + "3 - Parrot" + "\n" + "4 - Rabbit" + "\n" + "Give a number:");
                            numOfPet = scan.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input.");
                            scanner.nextLine();
                        }
                    }
                    manager.addPet(scan, numOfPet);
                    break;
                }

                case 2: {
                    Scanner scan = new Scanner(System.in);
                    manager.RemovePet(scan);
                    break;
                }

                case 3: {
                    manager.ShowAllPets();
                    break;
                }

                case 4: {
                    Scanner scan = new Scanner(System.in);
                    manager.searchByName(scan);
                    break;
                }

                case 5: {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }

        }


    }
}