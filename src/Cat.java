public class Cat extends Pet{

    public Cat(String name, int ageInMonths, int ageInYears, String breed, String gender, String size) {
        super(name, ageInMonths, ageInYears, breed, gender, size);
    }

    @Override
    void makeSound() {
        System.out.println(this.name + " says: Meow!");
    }

    @Override
    public String toString() {
        String ageInfo;

        if (ageInMonths > 0) {
            ageInfo = ageInMonths + " month" + (ageInMonths == 1 ? "" : "s");
        } else {
            ageInfo = ageInYears + " year" + (ageInYears == 1 ? "" : "s");
        }

        return "Cat - Name: " + name +
                ", Age: " + ageInfo +
                ", Breed: " + breed +
                ", Gender: " + gender +
                ", Size: " + size;
    }
}
