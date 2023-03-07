package AbstractClass;

abstract class AbstractExample {

    // has to be redefined in the child class
    public abstract void abstractMethod();

    public void nonAbstract(){
        System.out.println("This is an abstract Class");
    }
}