public class Estudiante {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String serial;

    // Constructor, get y set
    public Estudiante(String cedula, String nombre, String apellido, String telefono, String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.serial = serial;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSerial() {
        return serial;
    }
}
