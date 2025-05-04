public class Dog extends Pet{
    private boolean isTrained;

    public Dog(String name, int ageInMonths, int ageInYears, String breed, String gender, String size, boolean isTrained) {
        super(name, ageInMonths, ageInYears, breed, gender, size);
        this.isTrained = isTrained;
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " says: Woof!");
    }

    @Override
    public String toString() {
        String ageInfo;

        if (ageInMonths > 0) {
            ageInfo = ageInMonths + " month" + (ageInMonths == 1 ? "" : "s");
        } else {
            ageInfo = ageInYears + " year" + (ageInYears == 1 ? "" : "s");
        }

        return "Dog - Name: " + name +
                ", Age: " + ageInfo +
                ", Breed: " + breed +
                ", Gender: " + gender +
                ", Size: " + size +
                ", Trained: " + (isTrained ? "Yes" : "No");
    }


}
