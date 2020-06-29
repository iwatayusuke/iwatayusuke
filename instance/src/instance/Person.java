package instance;

public class Person {
    //属性（フィールド）
    String name;
    int age;

    //操作はなし

    public void myProfile() {
        System.out.println("私の名前は" + this.name + "です。");
        System.out.println("年齢は" + this.age + "です。");
        System.out.println("よろしくおねがいします。");
    }
}
