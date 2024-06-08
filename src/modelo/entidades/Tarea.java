package modelo.entidades;

public class Tarea {
    private int id;

    private String titulo;
    private String descripcion;
    private int estimacion;
    private float horasReales;
    private Empleado responsable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstimacion() {
        return estimacion;
    }

    public void setEstimacion(int estimacion) {
        this.estimacion = estimacion;
    }

    public float getHorasReales() {
        return horasReales;
    }

    public void setHorasReales(float horasReales) {
        this.horasReales = horasReales;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }
}
