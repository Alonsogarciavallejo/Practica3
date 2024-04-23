package Aplicacion;

 import Matematicas.mates;
// importamos la clase mates para poder usar metodos de las distintas

public class principal {
    public static void main(String[] args) {
        // realizamos el main para poder inicializar la practica
        if (args.length < 1) {
            System.out.println("Por favor, proporcione el número de pasos como argumento.");
            return;
        }
        //Se verifica si se proporciona al menos un argumento en línea de comandos. Si no se proporciona ningún argumento, se muestra un mensaje indicando que se necesita el número de pasos como argumento y la aplicación se cierra
        
        long pasos = Long.parseLong(args[0]);
        // 
        System.out.println("El número PI es " + mates.generarNumeroPiIterativo(pasos));
    }
}
