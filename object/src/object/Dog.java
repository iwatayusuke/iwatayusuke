package object;

public class Dog extends Animal{
    public double weight;

    public Dog() {};
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //runメソッド
    public void run() {
        System.out.println(this.name + "は走った");
    }

    //sleepメソッド
    public void sleep() {
        System.out.print(this.name + "は");
        super.sleep();
    }

}
