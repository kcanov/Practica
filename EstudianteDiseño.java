public class EstudianteDiseño extends Estudiante {
    private String modalidadEstudio;
    private int cantidadAsignaturas;

    public EstudianteDiseño(String cedula, String nombre, String apellido, String telefono, String serial, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, nombre, apellido, telefono, serial);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(String modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }
    
    @Override
    public String toString() {
        return "EstudianteDiseno{" +
                "cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", serial='" + getSerial() + '\'' +
                ", modalidad='" + getModalidadEstudio() + '\'' +
                ", asignaturas=" + getCantidadAsignaturas() +
                '}';
    }
}
