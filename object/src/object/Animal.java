package object;

public class Animal {
    //名前
    public String name;
    //年齢
    public int age;

    //コンストラクタ
    public Animal() {};
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //眠る
    public void sleep() {
        System.out.println("眠った");
    }
}
