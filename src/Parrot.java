public class Parrot extends Pet{
    private boolean canTalk;

    public Parrot(String name, int ageInMonths, int ageInYears, String breed, String gender, String size, boolean canTalk) {
        super(name, ageInMonths, ageInYears, breed, gender, size);
        this.canTalk = canTalk;
    }

    @Override
    void makeSound() {
        if(canTalk) {
            System.out.println(this.name + " says: Hi!");
        }
        System.out.println(this.name + " says: Squawk!");
    }

    @Override
    public String toString() {
        String ageInfo;

        if (ageInMonths > 0) {
            ageInfo = ageInMonths + " month" + (ageInMonths == 1 ? "" : "s");
        } else {
            ageInfo = ageInYears + " year" + (ageInYears == 1 ? "" : "s");
        }

        return "Parrot - Name: " + name +
                ", Age: " + ageInfo +
                ", Breed: " + breed +
                ", Gender: " + gender +
                ", Size: " + size +
                ", Can talk: " + (canTalk ? "Yes" : "No");
    }
}
