package singleton;

import com.sun.jdi.InternalException;

public class DatabaseManager {
    private static DatabaseManager cachedManager;

    private DatabaseManager() {
        System.out.println("Démarrage du gestionnaire de BDD…");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        System.out.println("Gestionnaire démarré !");
    }
    public void save() {

        System.out.println("Enregistrement effectué");
    }

    public static DatabaseManager getInstance(){
        if (cachedManager == null){
            cachedManager = new DatabaseManager();
        } return cachedManager;
    }
}
