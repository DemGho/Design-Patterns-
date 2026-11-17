import singleton.DatabaseManager;
import singleton.Entity;
import factory.*;

import java.lang.reflect.Type;

public class App {
    public static void main(String[] args) {

        testFactory("mobile");
    }

    private static void testSingleton(){
        Entity[] e = new Entity[10];

        for(int i =0; i < e.length; i++){
            System.out.println("Creation: " + (i+1));
            e[i] = new Entity();
        }
    }

    public static void testFactory(String type) {
        Dialog dialog;

        if (type.equals("windows")) {
            dialog = new WindowsDialog();
        } if(type.equals("mobile")) {
            dialog = new MobileDialog();
        }else {
            dialog = new WebDialog();
        }
        dialog.render();
    }
}
