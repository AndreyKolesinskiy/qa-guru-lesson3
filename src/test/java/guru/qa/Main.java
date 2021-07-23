package guru.qa;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", "Red", 3);

        cat.speak();
        cat.introduceYourself();

        //Now we'll change data and cat will introduce himself again

        cat.setName("Larry");
        cat.setColor("Black");
        cat.setAge(4);
        cat.introduceYourself();
    }
}
