package unal.todosalau.ecogarden.clases;

import java.util.List;

public class Jardin {
    private List<Planta> plantas;
    private String diseno;

    // Constructor, getters y setters...
    public Jardin(List<Planta> plantas, String diseno) {
        this.plantas = plantas;
        this.diseno = diseno;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }
}
