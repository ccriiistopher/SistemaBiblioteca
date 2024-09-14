package utp.edu.pe.poo.domain;

import utp.edu.pe.poo.model.Libro;

public class IngresoBiblioteca {
    final static String[] generos = new String[] {
            "Drama", "Suspenso"
    };

    public static Libro preguntarLibro() {
        Pantalla.linea();
        String title = "Nuevo libro";
        Pantalla.mostrarEnLinea(title, "", "", 5);
        Pantalla.mostrarSubrayado("*", title.length() + 4, 3);
        String titulo = Pantalla.leerTexto("Ingrese el título", "> ", ": ", 3);
        String autor = Pantalla.leerTexto("Ingrese el nombre del autor", "> ", ": ", 3);
        Pantalla.mostrarEnLinea("Ingrese el género del libro", "> ", ": ", 3);
        for (int i = 0; i < generos.length; i++) {
            Pantalla.mostrarEnLinea(generos[i], (i + 1) + ". ", ".", 5);
        }
        int numero = Pantalla.leerNumero("Ingrese el número de género", "> ", ": ", 3);
        String genero = generos[numero];
        String isbn = Pantalla.leerTexto("Ingrese el código del libro", "> ", ": ", 3);
        Libro libro = new Libro(titulo, autor, genero, isbn);
        Pantalla.mostrarAnimado("Libro registrado con éxito", "✓ ", ".    ", 3);
        return libro;
    }

}
