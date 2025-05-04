public class Rabbit extends Pet{

    public Rabbit(String name, int ageInMonths, int ageInYears, String breed, String gender, String size) {
        super(name, ageInMonths, ageInYears, breed, gender, size);
    }


    @Override
    void makeSound() {
        System.out.println(this.name + " says: Sniff sniff!");
    }

    @Override
    public String toString() {
        String ageInfo;

        if (ageInMonths > 0) {
            ageInfo = ageInMonths + " month" + (ageInMonths == 1 ? "" : "s");
        } else {
            ageInfo = ageInYears + " year" + (ageInYears == 1 ? "" : "s");
        }

        return "Rabbit - Name: " + name +
                ", Age: " + ageInfo +
                ", Breed: " + breed +
                ", Gender: " + gender +
                ", Size: " + size;
    }
}
