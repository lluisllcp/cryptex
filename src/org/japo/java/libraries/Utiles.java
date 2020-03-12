/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 *
 */
public class Utiles {

    // Instanciar Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String ESP = "---";
    public static final String ESPA = "-----------------------------";

    public static final void muestraBanner() {
        System.out.println();
        System.out.println("  		db   db d888888b d8888b. d8888b. d88888b d8b   db");
        System.out.println("  		88   88   `88'   88  `8D 88  `8D 88'     888o  88");
        System.out.println("  		88ooo88    88    88   88 88   88 88ooooo 88V8o 88");
        System.out.println("  		88~~~88    88    88   88 88   88 88~~~~~ 88 V8o88");
        System.out.println("  		88   88   .88.   88  .8D 88  .8D 88.     88  V888");
        System.out.println("  		YP   YP Y888888P Y8888D' Y8888D' Y88888P VP   V8P");
        System.out.println();
        System.out.println();
        System.out.println("                                 Folder Hidden                ");
        System.out.println();
        System.out.println("     ____________________________________________________________________");
        System.out.println();
        System.out.println();
    }
//------------------ OBTENER DOUBLE -----------------------------------
    public static final double obtener(String msgUser, String msgErr) {
        //Entrada de teclado
        double numero = 0;
        boolean isOk = true;
        //Semaforo
        do {
            try {
                //Entrada de datos
                System.out.printf(msgUser);
                numero = SCN.nextDouble();
                //Si el dato introducido es bueno, sale del bucle
                isOk = false;
            } catch (Exception e) {
                System.out.println(ESP);
                System.out.println(msgErr);
                System.out.println(ESP);
            } finally {
                //borrar buffer.
                SCN.nextLine();
            }
        } while (isOk);
        // Devuelve numero
        return numero;
    }
//------------------ OBTENER STRING -----------------------------------
    public static final String obtenerString() {
        String str;
        str = SCN.nextLine();

        return str;
    }

//------------------- SALIDA PROGRAMA------------------------------
    public static final String  deseaSalir() {
        String respuesta;
        //dowhile para salida
        do {
            System.out.println("\n¿Desea salir? (S/N):");
            respuesta = Utiles.obtenerString();
            respuesta = respuesta.toLowerCase();
        } while (!respuesta.equals("s") && !respuesta.equals("n"));
        return respuesta;
    }
//----------------- CREAR CARPETA -------------------------------

    public static final String carpeta() {
        File archivo = new File("hidden");
        if (archivo.exists()) {
            if (archivo.isDirectory()) {
                System.out.println("La carpeta ya existe");
                System.out.println("Guarde los archivos a ocultar en ella");
            }
        } else {
            archivo.mkdir();
            System.out.println("No existia el directorio, Pero ahora a sido creado!!");
            System.out.println("Guarde los archivos a ocultar en ella");
        }
        return null;
    }

//---------------------- RENOMBRAR CARPETA ----------------------------
    public static final String Renombre() {

        File oldfile = new File("hidden");
        File newfile = new File("Printers.{2227a280-3aea-1069-a2de-08002b30309d}");
        if (oldfile.renameTo(newfile)) {
            System.out.println("archivo renombrado");
        } else {
            System.out.println("error");

        }
        return null;
    }

//---------------------- REvertir CARPETA ----------------------------
    public static final String Revertir() {

        File oldfile = new File("Printers.{2227a280-3aea-1069-a2de-08002b30309d}");
        File newfile = new File("hidden");
        if (oldfile.renameTo(newfile)) {
            System.out.println("archivo renombrado");
        } else {
            System.out.println("error");

        }
        return null;
    }

//------------------------ CONTINUAR --------------------------------------
    public static final String deseaCont() {
        String respuesta;
        //dowhile para introducir otro
        do {
            System.out.println("\nQuieres ocultar esta carpeta?(S/N)");
            respuesta = Utiles.obtenerString();
            respuesta = respuesta.toLowerCase();
        } while (!respuesta.equals("s") && !respuesta.equals("n"));
        return respuesta;
    }
}

