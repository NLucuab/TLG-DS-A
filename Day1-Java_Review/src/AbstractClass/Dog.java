package AbstractClass;

public class Dog implements Animal{

    private String name;


    public void animalSound() {
        System.out.println("The dog " + getName() + " barks");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void setTricks(){
        System.out.println("Still a puppy, no tricks.");
    }
}