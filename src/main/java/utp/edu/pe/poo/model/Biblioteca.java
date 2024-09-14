package utp.edu.pe.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Libro> libros = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void registrarLibro(Libro libro){
        this.libros.add(libro);
    }

    public void removerLibro(Libro libro) {
        this.libros.remove(libro);
    }

    

}
