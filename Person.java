public class Person {
    String name;
    int age;
    static int personCount = 0;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        personCount++;
    }
    public void speak(){
        System.out.println("Hello, My name is "+ name + " and I am "+ age + " years old");
    }
    public static void displayPersonsCreated(){
        System.out.println("Total number of Persons: "+ personCount);
    }

}
