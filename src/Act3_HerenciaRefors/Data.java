package Act3_HerenciaRefors;

/**
 * Created by Myk on 28/09/2016.
 */
public class Data {

    //#1
    private static final String SEPARADOR = "-";
    private String data;

    private int dia, mes, any;

    /*
    //Para forma de String
    public String getData() {
        return data;
    }*/

    public String getData(){
        return dia + SEPARADOR + mes + SEPARADOR + any;
    }

    /*
    //Para String
    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        this.data = data;
    }*/

    public void setData(String data) throws Exception {

        if (!data.contains(SEPARADOR)) throw new Exception();
        int [] dates = descomposaData();
        this.dia = dates[1];
        this.mes = dates[2];
        this.any = dates[3];
    }

    /*
    //Para String
    public int getAny(){
        return data != null ? descomposaData()[2] : 0;
    }*/

    public int getAny(){
        return any;
    }

    /*
    //Para String
    private int[] descomposaData(){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }*/

    private int[] descomposaData(){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }


    /**
     * 1. Reflexiona sobre les linies marcades amb #1 i #2.
     * 2. Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de
     * trespàs (per simplificar l'algoritmia considerarem que els anys de trespàs son tots els anys parells) Reflexiona sobre:
     *      1. A què pots accedir de la superclasse?
     *      2. A què no pots accedir?
     * 3. Ara canvia la implementació de la classe Data. Fes-la amb la representació de la data amb tres atributs enters.
     *      1. Segueix funcionant la classe AnyDeTrespas ?
     *      2. Què hauria passat si per algun motiu haguesis pogut emprar el mètode privat descomposaData.
     */
}
