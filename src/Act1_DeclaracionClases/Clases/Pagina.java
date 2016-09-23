package Act1_DeclaracionClases.Clases;

import java.util.ArrayList;

/**
 * Created by Myk on 22/09/2016.
 */
public class Pagina {

    //Atributos
    private int dia, mes;
    private boolean festiu=false;
    private ArrayList <Cita> detalles;

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

