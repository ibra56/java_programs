import javax.xml.namespace.QName;

public class Cat {
    private  String color;
    private  String mood;
    private String name;
    private int age;

    public Cat(String color, String mood, String name, int age){
        this.color = color;
        this.mood = mood;
        this.name = name;
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public String getName(){
        return this.name;
    }

    public  void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void  setAge(int age){
        this.age = age;
    }
    public String getMood(){
        return  mood;
    }

    private void changeMood(String newMood){
        mood = newMood;
    }
    public void purr(){
        System.out.println("Cat purrs");
    }

    public void makeHappy(){
        changeMood("happy");
        purr();
    }
    public void meow(){
        System.out.println("Meow");
    }

    public void scratch(){
        System.out.println("Scratch");
    }
    public void displayBehaviour(){
        meow();
        scratch();
        changeMood("curious");
    }

    public  void displayInfo(){
        System.out.println(this.name + " is "+ this.age + " year(s) old");
    }

}
