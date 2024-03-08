package Aplicacion;

import Matematicas.mates;

public class principal {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporcione el número de pasos como argumento.");
            return;
        }
        
        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + mates.generarNumeroPiIterativo(pasos));
    }
}