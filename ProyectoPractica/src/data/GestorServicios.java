package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {
    public void instanciacion() {
        ServicioTuristico rutaGastronomica1 = new RutaGastronomica("Ruta del Completo", 4, 5);
        ServicioTuristico rutaGastronomica2 = new RutaGastronomica("Ruta de la Empanada", 3, 6);

        ServicioTuristico paseoLacustre1 = new PaseoLacustre("Paseo del Lago Ness", 6, "Barco");
        ServicioTuristico paseoLacustre2 = new PaseoLacustre("Paseo del Lago Llanquihue", 6, "Bote");

        ServicioTuristico excursionCultural1 = new ExcursionCultural("Excursion del Carrete", 12, "Ruta Baco");
        ServicioTuristico excursionCultural2 = new ExcursionCultural("Excursion Trasandina", 12, "Los andes");

        System.out.println(rutaGastronomica1);
        System.out.println(rutaGastronomica2);

        System.out.println(paseoLacustre1);
        System.out.println(paseoLacustre2);

        System.out.println(excursionCultural1);
        System.out.println(excursionCultural2);

    }
}
