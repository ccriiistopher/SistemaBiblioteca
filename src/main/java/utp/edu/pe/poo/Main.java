package utp.edu.pe.poo;

import utp.edu.pe.poo.domain.IngresoBiblioteca;
import utp.edu.pe.poo.domain.Menu;
import utp.edu.pe.poo.domain.Pantalla;
import utp.edu.pe.poo.model.Biblioteca;
import utp.edu.pe.poo.model.Libro;

public class Main {
    static boolean salir;
    static Biblioteca biblioteca = new Biblioteca();
    final static String[] options = new String[] {
            "Registrar Libro",
            "Registrar Usuario",
            "Eliminar Libro",
            "Eliminar Usuario",
            "Buscar Libro",
            "Registrar Préstamo",
            "Eliminar Préstamo",
            "Ver préstamos",
            "Cerrar aplicación"
    };

    public static void main(String[] args) {
        while (!salir) {
            Menu menu = new Menu(options);
            procesarOpcion(menu.mostrarMenu());
        }
    }

    static void procesarOpcion(int op) {
        if (op <= 0 || op > options.length) {
            Pantalla.mostrarEnLinea("La opción seleccionada " + op + " no es válida.", "X Error: ", "", 3);
            return;
        }
        int option = op - 1;
        switch (option) {
            case 0:
                Libro libro = IngresoBiblioteca.preguntarLibro();
                biblioteca.registrarLibro(libro);
                break;
            default:
                salir = true;
        }

    }
}