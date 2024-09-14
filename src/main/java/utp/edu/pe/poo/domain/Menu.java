package utp.edu.pe.poo.domain;

public class Menu {
    String[] options;

    public Menu(String[] options) {
        this.options = options;
    }

    public int mostrarMenu() {
        String titulo = "Biblioteca Nacional del Perú";
        Pantalla.mostrarEnLinea(titulo, "", "", 5);
        Pantalla.mostrarSubrayado("-", titulo.length() + 4, 3);
        Pantalla.linea();
        Pantalla.mostrarEnLinea("Menú de opciones", "* ", ":", 3);
        for (int i = 0; i < options.length; i++) {
            Pantalla.mostrarEnLinea(options[i], i + 1 + ". ", ".", 3);
        }
        return Pantalla.leerNumero("Ingresa una opción", "> ", ": ", 3);
    }

}
