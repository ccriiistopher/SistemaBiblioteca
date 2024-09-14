package utp.edu.pe.poo.domain;

import java.util.Scanner;

public class Pantalla {
    private static Scanner scanner = new Scanner(System.in);

    private Pantalla() {
    }

    public static void mostrarSubrayado(String caracter, int longitud, int tabulacion) {
        String base = "";
        String tab = "";
        for (int i = 0; i < tabulacion; i++) {
            tab += " ";
        }
        for (int i = 0; i < longitud; i++) {
            base += caracter;
        }
        System.out.println(tab + base);
    }

    private static String generateContent(String contenido, String prefijo, String sufijo, int tabulacion) {
        String tab = "";
        for (int i = 0; i < tabulacion; i++) {
            tab += " ";
        }
        return tab + prefijo + contenido + sufijo;
    }

    public static void mostrarEnLinea(String contenido, String prefijo, String sufijo, int tabulacion) {
        System.out.println(generateContent(contenido, prefijo, sufijo, tabulacion));
    }

    public static void mostrar(String contenido, String prefijo, String sufijo, int tabulacion) {
        System.out.print(generateContent(contenido, prefijo, sufijo, tabulacion));
    }

    public static void mostrarAnimado(String contenido, String prefijo, String sufijo, int tabulacion) {
        String text = new String(generateContent(contenido, prefijo, sufijo, tabulacion));
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        System.out.print("\n");
    }

    public static void linea() {
        System.out.println("");
    }

    public static int leerNumero(String contenido, String prefijo, String sufijo, int tabulacion) {
        mostrar(contenido, prefijo, sufijo, tabulacion);
        return scanner.nextInt();
    }

    public static String leerTexto(String contenido, String prefijo, String sufijo, int tabulacion) {
        mostrar(contenido, prefijo, sufijo, tabulacion);
        return scanner.next();
    }
}
