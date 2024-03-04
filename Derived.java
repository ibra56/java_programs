public class Derived extends Base{
    private int value;

    @Override
    void setup(){
        value = 42;
        System.out.println("Derived setup with value "+ value);
    }

    Derived (){
        System.out.println("Derived Constructor");
    }
    public static void main(String[] args){
        Derived d = new Derived();
        System.out.println("Derived object value:" + d.value);
    }
}
