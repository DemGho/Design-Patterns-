package singleton;

import singleton.*;

public class Entity {
    public Entity(){
        System.out.println("Création de l’entité…");
        System.out.println(("Sauvegarde de l’entité…"));

        DatabaseManager db = DatabaseManager.getInstance();
        db.save();

        System.out.println("Entité créée et sauvegardée !");
    }
}
