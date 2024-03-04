public class Main {
    public static void main (String[] args){
//        System.out.println("Hello World");
        Cat myCat = new Cat("black","sleepy","kitty",3);
        System.out.println("This is a "+ myCat.getColor() + " and feels " + myCat.getMood());
        myCat.makeHappy();
        myCat.displayInfo();

        Cat tooby = new Cat("red","unhappy","taddy",4);
        tooby.meow();
        tooby.scratch();

        tooby.displayBehaviour();
        tooby.displayInfo();

        int[] values = {3,5,6,7};
        for (int value : values){
            System.out.println(value);
        }



    }
}
