package modelo.entidades;

public class Empleado {
    private int id;
    private String nombre;
    private float costoPorHora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(float costoPorHora) {
        this.costoPorHora = costoPorHora;
    }
}
