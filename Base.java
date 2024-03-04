public class Base {
    void setup(){
        System.out.println("Base setup");
    }
    Base(){
        System.out.println("Base Constructor");
        setup();
    }
}
