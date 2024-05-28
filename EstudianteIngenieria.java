public class EstudianteIngenieria extends Estudiante {
    private int numSemestre;
    private float promedioAcumulado;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, String serial, int numSemestre, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono, serial);
        this.numSemestre = numSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    public int getNumeroSemestre() {
        return numSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numSemestre = numSemestre;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
    
    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "cedula='" + getCedula() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", serial='" + getSerial() + '\'' +
                ", semestre=" + getNumeroSemestre() +
                ", promedio=" + getPromedioAcumulado() +
                '}';
    }
}