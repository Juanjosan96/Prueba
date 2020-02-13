package Funciones;

public class Geometría {

    public static double volumenCilindro(double r, double h) {
        return Math.PI * r * r * h;
    }

    /**
     * Calcula la longitud de una circunferencia a partir del radio.
     *
     * @param r radio de la circunferencia
     * @return longitud de la circunferencia
     */
    public static double longitudCircunferencia(double r) {
        return 2 * Math.PI * r;
    }
}
