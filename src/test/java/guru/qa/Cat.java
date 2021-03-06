package guru.qa;

public class Cat {

    String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speak() {
        System.out.println("Meow! Meow! Meow!");
    }

    void introduceYourself() {
        System.out.println("Hello! " + "My name is "+ name + ", I'm " + color +
                " cat and I'm " + age + " years old.");
    }
}
