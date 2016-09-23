package Act1_DeclaracionClases.Clases;

import java.util.ArrayList;

/**
 * Created by Myk on 22/09/2016.
 */
public class Pagina {

    //Atributos
    public int dia, mes;
    public boolean festiu=false;
    public ArrayList <Cita> detalles;

    //Constructor
    public Pagina(int dia, int mes, boolean festiu, String horaInici, String horaFinalitzacio, String motiu) {
        this.dia = dia;
        this.mes = mes;
        this.festiu=festiu;
        detalles=new ArrayList<>();
    }

    public void escribirCita(int dia, int mes, boolean festiu){
        this.dia=dia;
        this.mes=mes;
        this.festiu=festiu;
    }

    public void esborrarCita(int dia, int mes){

    }
}

