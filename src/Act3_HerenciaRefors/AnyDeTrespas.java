package Act3_HerenciaRefors;

import java.util.Scanner;

/**
 * Created by Myk on 28/09/2016.
 */
public class AnyDeTrespas extends Data {

    private String fecha;

    public AnyDeTrespas() throws Exception {
        usandoString();

    }

    private void usandoString() throws Exception {
        System.out.println("Introduce una fecha en forma de ddmmaaaa");
        Scanner sc = new Scanner(System.in);
        fecha=sc.next();
        setData(fecha);
        if(getAny()%4!=0){
            System.out.println("El ao no es bisiesto.");
        }
    }
}
