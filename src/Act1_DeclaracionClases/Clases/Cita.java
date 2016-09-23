package Act1_DeclaracionClases.Clases;

/**
 * Created by Myk on 22/09/2016.
 */
public class Cita {

    //Atributos
    private String horaInici, horaFinalitzacio, motiu;

    //Constructor
    public Cita(String horaInici, String horaFinalitzacio, String motiu) {
        this.horaInici = horaInici;
        this.horaFinalitzacio = horaFinalitzacio;
        this.motiu = motiu;
    }

    public void escriureContingut(String sms){
        motiu=sms;
    }
}

