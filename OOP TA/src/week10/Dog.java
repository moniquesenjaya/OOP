package week10;

public class Dog extends Animal implements LandAnimal{
    public String color;

    Dog(String name, String gender, String color){
        this.name = name;
        this.gender = gender;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void breath() {
        System.out.println("Breathing...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    public void barking(){
        System.out.println("Bark!!");
    }
}




