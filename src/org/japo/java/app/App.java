/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.io.IOException;
import java.util.Scanner;
import org.japo.java.libraries.Utiles;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public final class App {

    public final void launchApp() throws IOException {

//        Utiles.muestraBanner();

        int opcion;
        String respuesta;

        Scanner SCN = new Scanner(System.in);

        do {
            Utiles.muestraBanner();
            System.out.println("1. Crear Carpeta");
            System.out.println("2. Ocultar");
            System.out.println("3. Revertir");
            System.out.println("4. Borrar directorio hidden");
            System.out.println("5. Salir");
            System.out.println(" --- ");
            System.out.print("Introduzca la opción deseada: ");

            opcion = SCN.nextInt();

            switch (opcion) {
                //crear carpeta
                case 1:
                    Utiles.carpeta();
                    break;
                //ocultar = renombrar
                case 2:
                    Utiles.Renombre();
                    Utiles.Cmd();
                    break;
                //restaurar
                case 3:
                    Utiles.Pass();
                    Utiles.Revertir();
                    Utiles.CmdRevert();
                    break;
                //Borrar directorio
                case 4:
                    Utiles.Borrar();
                    break;
                //salida
                case 5:
                    //salir
                    respuesta = Utiles.deseaSalir();
                    respuesta.equalsIgnoreCase("n");
                    break;
                //Default
                default:
                    System.out.println("Solo acepto numeros del 1 al 4");
            }
            //salida

        } while(true);
        
    }
}
