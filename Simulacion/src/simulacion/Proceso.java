package simulacion;


public class Proceso {
    
    private String estado;
    private int tamano;
    private String nombre;
    private int id;
    private int NoHilos;
    private String recursos;

    public Proceso(String estado, int tamano, String nombre, int id, int NoHilos, String recursos) {
        this.estado = estado;
        this.tamano = tamano;
        this.nombre = nombre;
        this.id = id;
        this.NoHilos = NoHilos;
        this.recursos = recursos;
    }

    public Proceso(String estado, int tamano, String nombre, String recursos) {
        this.estado = estado;
        this.tamano = tamano;
        this.nombre = nombre;
        this.recursos = recursos;
    }

    public Proceso() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoHilos() {
        return NoHilos;
    }

    public void setNoHilos(int NoHilos) {
        this.NoHilos = NoHilos;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }
    
    
    
}
