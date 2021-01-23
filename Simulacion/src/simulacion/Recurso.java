
package simulacion;

public class Recurso {
    
    private Proceso proceso;
    private String nombre;
    private boolean estado;

    public Recurso(Proceso proceso, String nombre, boolean estado) {
        this.proceso = proceso;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
