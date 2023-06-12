package unal.todosalau.ecogarden.clases;

import java.util.List;

public class Usuario {
    private List<Planta> plantas;
    private String jardines;
    private String nombre;

    // Constructor, getters y setters...

    public Usuario(String nombre, List<Planta> plantas, String jardines) {
        this.plantas = plantas;
        this.jardines = jardines;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }

    public String getJardines() {
        return jardines;
    }

    public void setJardines(String jardines) {
        this.jardines = jardines;
    }
}
