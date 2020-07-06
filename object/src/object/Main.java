package object;

public class Main {

    public static void main(String[] args) {
        System.out.println("インスタンスを生成していない状態");
        System.out.println(Person.wallet);

        //インスタンスを２つ生成
        Person hoge01 = new Person(1000);
        Person hoge02 = new Person(2000);

        System.out.println("インスタンスhoge01でwalletにアクセス");
        System.out.println(hoge01.wallet);
        System.out.println("インスタンスhoge02でwalletにアクセス");
        System.out.println(hoge02.wallet);
        System.out.println("クラスPersonでwalletにアクセス");
        System.out.println(Person.wallet);
    }

}
