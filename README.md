# Practica3
Esta practica esta realizada por Alonso García Vallejo 
La he realizado através de expresion lambda , utilizando dos clases diferentes ( mates y aplicacion ).
En esta práctica:
MATEMATICAS:
El código está dentro del paquete Matematicas.
Se importan las clases necesarias, ThreadLocalRandom para generar números aleatorios y IntStream para operar sobre secuencias de números enteros.
Se define una clase mates que contiene un método estático llamado generarNumeroPiIterativo, el cual calcula una aproximación al número pi através del metodo de Montecarlos.                                         Se utiliza IntStream.range(0, (int) pasos).parallel() para generar una secuencia de números enteros en el rango [0, pasos) que se procesarán en paralelo.
Para cada número en la secuencia, se genera un par de coordenadas (x, y) aleatorias en el intervalo [0,1] utilizando ThreadLocalRandom.current().nextDouble().
Se calcula la distancia al origen (distanciaAlOrigen) utilizando el teorema de Pitágoras.
Se incrementa dentroCirculo si la distancia al origen es menor o igual a 1 (es decir, si el punto cae dentro del círculo).
Se calcula la probabilidad de que un punto aleatorio esté dentro del círculo dividiendo el número de puntos dentro del círculo (dentroCirculo) por el número total de puntos generados (pasos).
Finalmente, se utiliza la relación entre el área del círculo y el área de un cuadrado circunscrito para aproximar pi, devolviendo el valor aproximado multiplicado por 4. Esto se debe a que la probabilidad calculada es pi / 4, y para obtener pi, simplemente se multiplica por 4.

APLICACION:
El código está dentro del paquete Aplicacion.
Se importa la clase mates del paquete Matematicas. Esto significa que la clase principal puede acceder a la funcionalidad proporcionada por la clase mates para calcular el número pi.
La clase principal contiene el método main, que es el punto de entrada de la aplicación.
Dentro del método main, se verifica si se proporciona al menos un argumento en línea de comandos. Si no se proporciona ningún argumento, se muestra un mensaje indicando que se necesita el número de pasos como argumento y la aplicación se cierra.
Si se proporciona al menos un argumento, se asume que es el número de pasos para el cálculo de la aproximación de pi. Este argumento se convierte de String a long utilizando Long.parseLong(args[0]).
Se invoca el método generarNumeroPiIterativo de la clase mates, pasando el número de pasos como argumento. Este método calcula una aproximación de pi utilizando el método de Monte Carlo.
El resultado del cálculo se imprime en la consola junto con un mensaje informativo.
En resumen, este código Java define una aplicación simple que calcula una aproximación del número pi utilizando el método de Monte Carlo, y toma el número de pasos como argumento de línea de comandos.

