public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person("Ibrahim",24);
        Person person2 = new Person("Hellen",22);
        Person person3 = new Person("Madina",50);

        person1.speak();
        person2.speak();
        person3.speak();

        Person.displayPersonsCreated();
    }
}
