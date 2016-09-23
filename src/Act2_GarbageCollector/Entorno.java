package Act2_GarbageCollector;

import java.util.ArrayList;

/**
 * Created by Myk on 23/09/2016.
 */
public class Entorno {

    //Atributos

    //Constructor
    public Entorno() throws Throwable {
        Basura bas = new Basura();
        System.out.println("Esperando...");
        bas=null;
        System.gc();
    }
}
