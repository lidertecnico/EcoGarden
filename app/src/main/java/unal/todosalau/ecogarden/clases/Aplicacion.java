package unal.todosalau.ecogarden.clases;

import java.util.List;

public class Aplicacion {
    private List<Usuario> usuarios;
    private List<Planta> catalogoPlantas;

    // Constructor, getters y setters...
    public Aplicacion(List<Usuario> usuarios, List<Planta> catalogoPlantas) {
        this.usuarios = usuarios;
        this.catalogoPlantas = catalogoPlantas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Planta> getCatalogoPlantas() {
        return catalogoPlantas;
    }

    public void setCatalogoPlantas(List<Planta> catalogoPlantas) {
        this.catalogoPlantas = catalogoPlantas;
    }
}
