abstract class Pet {
    protected String name;
    protected int ageInYears;
    protected int ageInMonths;
    protected String breed;
    protected String gender;
    protected String size;

    public Pet(String name, int ageInMonths, int ageInYears, String breed, String gender, String size){
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.ageInYears = ageInYears;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
    }

    abstract void makeSound();

}
