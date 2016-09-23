package Act2_GarbageCollector;

/**
 * Created by Myk on 23/09/2016.
 */
public class Basura {
    protected void finalize() throws Throwable{
        System.out.println("Finalizado");
    }
}
