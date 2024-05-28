package practica;

public class EstudianteDiseño extends Estudiante {
    private String modalidad;
    private int asignaturas;
    private String marca;
    private String almacenamiento;
    private float tamaño;
    private float peso;
    private float precio;

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String serial, String modalidad, int asignaturas, String marca, String almacenamiento, float tamaño, float peso, float precio) {
        super(cedula, nombre, apellido, telefono, serial);
        this.modalidad = modalidad;
        this.asignaturas = asignaturas;
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.tamaño = tamaño;
        this.peso = peso;
        this.precio = precio;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "EstudianteDiseño{" +
                "modalidad='" + modalidad + '\'' +
                ", asignaturas=" + asignaturas +
                ", marca='" + marca + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", tamaño=" + tamaño +
                ", peso=" + peso +
                ", precio=" + precio +
                ", cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", serial='" + getSerial() + '\'' +
                '}';
    }
}
