package utp.edu.pe.poo.model;

public class Profesor extends Usuario {
    public Profesor(String nombres, String apellidos, String dni) {
        super(nombres, apellidos, dni);
        this.tipo = "Profesor";
    }
}
