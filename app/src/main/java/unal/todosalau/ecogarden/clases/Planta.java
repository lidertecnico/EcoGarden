package unal.todosalau.ecogarden.clases;
import unal.todosalau.ecogarden.enumeraciones.TipoPlanta;
public class Planta {
    private String nombre;
    private TipoPlanta tipo;
    private String necesidadesAgua;
    private String necesidadesLuz;
    private String contribucionBiodiversidad;
    // Constructor, getters y setters...
    public Planta(String nombre, TipoPlanta tipo, String necesidadesAgua, String necesidadesLuz, String contribucionBiodiversidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.necesidadesAgua = necesidadesAgua;
        this.necesidadesLuz = necesidadesLuz;
        this.contribucionBiodiversidad = contribucionBiodiversidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPlanta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlanta tipo) {
        this.tipo = tipo;
    }

    public String getNecesidadesAgua() {
        return necesidadesAgua;
    }

    public void setNecesidadesAgua(String necesidadesAgua) {
        this.necesidadesAgua = necesidadesAgua;
    }

    public String getNecesidadesLuz() {
        return necesidadesLuz;
    }

    public void setNecesidadesLuz(String necesidadesLuz) {
        this.necesidadesLuz = necesidadesLuz;
    }

    public String getContribucionBiodiversidad() {
        return contribucionBiodiversidad;
    }

    public void setContribucionBiodiversidad(String contribucionBiodiversidad) {
        this.contribucionBiodiversidad = contribucionBiodiversidad;
    }
}
