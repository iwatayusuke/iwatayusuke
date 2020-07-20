package object;

public class Person {
    //名前
    private String name = "";
    //年齢
    private int age = 0;
    //財布
    static int wallet = 0;

    //コンストラクタ　引数なし
    public Person(){}

    //コンストラクタ　引数あり
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //財布の中身
    public Person(int wallet){
        this.wallet +=  wallet;
    }

    //getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void myProfile() {
        System.out.println("私の名前は" + this.name + "です。");
        System.out.println("年齢は" + this.age + "です。");
        System.out.println("よろしくおねがいします。");
    }

}
