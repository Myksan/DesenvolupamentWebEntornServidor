package Act1_DeclaracionClases.Menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Myk on 22/09/2016.
 */
public class Menu {

    //Atributos


    //Constructor
    public Menu(){
        menu();//Elige la página o fecha en la que quieres escribir
    }

    private void menu(){

        //Atributos
        int n;

        //Proceso
        System.out.println("Como quieres escribir la cita, eligiendo la hoja o la fecha?");
        System.out.println("1. Hoja");
        System.out.println("2. Fecha");
        n=Integer.parseInt(leerString());
        switch (n) {
            case 1:
                eleccionHoja();
                break;
            case 2:
                eleccionFecha();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void eleccionFecha() {

    }

    private void eleccionHoja() {

    }

    private String leerString(){
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            return br.readLine();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
