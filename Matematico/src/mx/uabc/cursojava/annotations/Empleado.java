package mx.uabc.cursojava.annotations;

@JsonSerializable
public class Empleado {

    @JsonElement
    private int clave;

    @JsonElement
    private String nombre;

    @JsonElement
    private String apellidoPaterno;

    @JsonElement
    private String apellidoMaterno;

    private double sueldo;

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Init
    public void initNombres() {
        this.nombre = this.nombre.substring(0,1).toUpperCase()+this.nombre.substring(1).toLowerCase();
        this.apellidoPaterno = this.apellidoPaterno.substring(0,1).toUpperCase()+this.apellidoPaterno.substring(1).toLowerCase();
        this.apellidoMaterno = this.apellidoMaterno.substring(0,1).toUpperCase()+this.apellidoMaterno.substring(1).toLowerCase();
    }

    public Empleado(int clave, String nombre, String apellidoPaterno, String apellidoMaterno, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sueldo = sueldo;
    }
}
