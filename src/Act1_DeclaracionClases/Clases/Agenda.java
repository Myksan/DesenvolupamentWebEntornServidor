package Act1_DeclaracionClases.Clases;

import java.util.ArrayList;

/**
 * Created by Myk on 22/09/2016.
 */
public class Agenda {

    //Atributos
    public int any, pag;
    public ArrayList<Pagina> fecha;

    //Constructor
    public Agenda(int any, int pag, int dia, int mes, boolean festiu, String horaInici, String horaFinalitzacio, String motiu) {
        this.any = any;
        this.pag=pag;
        fecha=new ArrayList<>();
    }

    public void passarPaginaEndavant(){
        if(pag==365){
            System.out.println("No quedan más hojas en la agenda.");
        }
        else{
            pag++;
        }
    }

    public void passarPaginaEndarrere(){
        if(pag==1){
            System.out.println("Estás en la primera hoja de la agenda.");
        }
        else{
            pag--;
        }
    }
}
