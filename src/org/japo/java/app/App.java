/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.util.Date;
import java.util.Scanner;
import org.japo.java.libraries.Utiles;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public final class App {

    public final void launchApp() {

        Utiles.muestraBanner();

        int opcion;
        String respuesta;

        Scanner SCN = new Scanner(System.in);

        do {
            System.out.println("1. Crear Carpeta");
            System.out.println("2. Ocultar");
            System.out.println("3. Revertir");
            System.out.println("4. Salir");
            System.out.print("Introduzca la opción deseada: ");
            opcion = SCN.nextInt();

            switch (opcion) {
                //crear carpeta
                case 1:
                    Utiles.carpeta();
                    break;
                //ocultar = renombrar
                case 2:
//                    do {
//                        Utiles.Renombre();
//                        respuesta = Utiles.deseaCont();
//                    } while (respuesta.equalsIgnoreCase("s"));

                    Utiles.Renombre();
                    break;
                //restaurar
                case 3:
                    Utiles.Revertir();
                    break;
                //salida
                    case 4:
                    //salir
                    break;
                default:
                    System.out.println("Solo acepto numeros del 1 al 4");
            }
            //salida
            respuesta = Utiles.deseaSalir();
        } while (respuesta.equalsIgnoreCase("n"));
    }

}
