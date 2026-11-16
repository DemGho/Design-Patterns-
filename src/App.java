import singleton.DatabaseManager;
import singleton.Entity;

public class App {
    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton(){
        Entity[] e = new Entity[10];

        for(int i =0; i < e.length; i++){
            System.out.println("Creation: " + (i+1));
            e[i] = new Entity();
        }
    }


}
