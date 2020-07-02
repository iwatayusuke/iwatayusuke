package standardClass;

public class Task5 {

    public static void main(String[] args) {
        String text = "cat_mouse_mouse_cat_cat";
        String[] strAray = text.split("_");
        int catcount = 0, mousecount = 0;
        String animal = "";

        for (int i = 0; i < strAray.length; i++) {
            if("cat".equals(strAray[i] )) {
                catcount++;
            }else if("mouse".equals(strAray[i])) {
                mousecount++;
            }
        }

        if(catcount < mousecount) {
            animal = "mouse";
        }else if(mousecount < catcount) {
            animal = "cat";
        }
        System.out.println(animal + "の方が多い");
    }

}
