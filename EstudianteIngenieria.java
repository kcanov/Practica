package practica;

public class EstudianteIngenieria extends Estudiante {
    private int semestre;
    private float promedio;
    private String sistemaOperativo;
    private String procesador;
    private String marca;
    private float tamaño;
    private float precio;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, String serial, int semestre, float promedio, String sistemaOperativo, String procesador, String marca, float tamaño, float precio) {
        super(cedula, nombre, apellido, telefono, serial);
        this.semestre = semestre;
        this.promedio = promedio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }



    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "semestre=" + semestre +
                ", promedio=" + promedio +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", precio=" + precio +
                ", cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", serial='" + getSerial() + '\'' +
                '}';
    }
}
