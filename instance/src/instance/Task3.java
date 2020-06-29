package instance;

class Task3 {
    public static void main(String args[]){
        //Personクラスのインスタンスを生成
        Person iwata = new Person();

        //生成したPersonインスタンスのフィールドに値を設定
        iwata.name = "岩田祐介";
        iwata.age = 29;

        iwata.myProfile();
    }

}
