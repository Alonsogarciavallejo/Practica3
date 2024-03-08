package Matematicas;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class mates {
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long dentroCirculo = IntStream.range(0, (int) pasos)
                                      .parallel()  // Para ejecutar en paralelo
                                      .mapToLong(i -> {
                                          double x = ThreadLocalRandom.current().nextDouble();
                                          double y = ThreadLocalRandom.current().nextDouble();
                                          double distanciaAlOrigen = Math.sqrt(x * x + y * y);
                                          return (distanciaAlOrigen <= 1) ? 1 : 0;
                                      })
                                      .sum();

        // La probabilidad de que un punto aleatorio esté dentro del círculo es igual al área del círculo dividido
        // por el área del cuadrado. Como el círculo tiene radio 1, su área es pi, y el área del cuadrado es 1.
        // Por lo tanto, la probabilidad es igual a pi / 4.
        double probabilidad = (double) dentroCirculo / pasos;

        // Pi es aproximadamente igual a 4 veces la probabilidad calculada.
        return 4 * probabilidad;
    }
}