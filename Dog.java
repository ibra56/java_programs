public class Dog extends Animal{
    Dog(String name,String species){
        super(name,species);
    }
    public void bark(){
        System.out.println(name +" is barking");
    }
    public static void main(String[] args){
        Dog myDog = new Dog("kethy","German Shepherd");
        System.out.println(myDog.name + " is a "+ myDog.species);
        myDog.bark();
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
