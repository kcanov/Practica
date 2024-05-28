public class Auxiliar {
    
    private final GestionPrestamos gestionPrestamos = new GestionPrestamos();
    private final Validaciones validaciones = new Validaciones();
    
    public void start() {
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú principal:");
            System.out.println("1. ESTUDIANTES DE INGENIERIA.");
            System.out.println("2. ESTUDIANTES DE DISEÑO.");
            System.out.println("3. IMPRIMIR INVENTARIO TOTAL.");
            System.out.println("4. SALIR DEL PROGRAMA.");
            int opcion = validaciones.validarEntero("Seleccione una opción:", 4);

            switch (opcion) {
                case 1:
                    menuIngenieria();
                    break;
                case 2:
                    menuDiseno();
                    break;
                case 3:
                    gestionPrestamos.imprimirInventario();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void menuIngenieria() {
        boolean volver = false;

        while (!volver) {
            System.out.println("Menú estudiantes de Ingeniería:");
            System.out.println("1.1 Registrar préstamo de equipo.");
            System.out.println("1.2 Modificar préstamo de equipo.");
            System.out.println("1.3 Devolución de equipo.");
            System.out.println("1.4 Buscar equipo.");
            System.out.println("1.5 Volver al menú principal.");

            int opcion = validaciones.validarEntero("Seleccione una opción:", 5);

            switch (opcion) {
                case 1:
                    registrarPrestamoIngenieria();
                    break;
                case 2:
                    modificarPrestamo("ingenieria");
                    break;
                case 3:
                    devolucionEquipo();
                    break;
                case 4:
                    buscarEquipo();
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void menuDiseno() {
        boolean volver = false;

        while (!volver) {
            System.out.println("Menú estudiantes de Diseño:");
            System.out.println("2.1 Registrar préstamo de equipo.");
            System.out.println("2.2 Modificar préstamo de equipo.");
            System.out.println("2.3 Devolución de equipo.");
            System.out.println("2.4 Buscar equipo.");
            System.out.println("2.5 Volver al menú principal.");

            int opcion = validaciones.validarEntero("Seleccione una opción:", 5);

            switch (opcion) {
                case 1:
                    registrarPrestamoDiseno();
                    break;
                case 2:
                    modificarPrestamo("diseno");
                    break;
                case 3:
                    devolucionEquipo();
                    break;
                case 4:
                    buscarEquipo();
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void registrarPrestamoIngenieria() {
        String cedula = validaciones.validarCedula("\nIngrese la cédula del estudiante (8-10 números):");
        String nombre = validaciones.validarTexto("\nIngrese el nombre del estudiante (3-30 letras):", 3, 30);
        String apellido = validaciones.validarTexto("\nIngrese el apellido del estudiante (3-30 letras):", 3, 30);
        String telefono = validaciones.validarTelefono("\nIngrese el teléfono del estudiante (7-10 números):");
        int semestre = validaciones.validarEntero("\nIngrese el número de semestre del estudiante (1-30):", 30);
        float promedio = validaciones.validarFloat("\nIngrese el promedio acumulado del estudiante (0.0 hasta 5.0):");
        String serial = validaciones.validarTexto("\nIngrese el serial del equipo:", 1, 20);

        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, serial, semestre, promedio);
        gestionPrestamos.registrarPrestamo(estudiante);
    }

    public void registrarPrestamoDiseno() {
        String cedula = validaciones.validarCedula("\nIngrese la cédula del estudiante (8-10 números):");
        String nombre = validaciones.validarTexto("\nIngrese el nombre del estudiante (3-30 letras):", 3, 30);
        String apellido = validaciones.validarTexto("\nIngrese el apellido del estudiante (3-30 letras):", 3, 30);
        String telefono = validaciones.validarTelefono("\nIngrese el teléfono del estudiante(7-10 números):");
        String modalidad = validaciones.validarModalidad();
        int asignaturas = validaciones.validarEntero("\nIngrese la cantidad de asignaturas que está viendo el estudiante (1-12):", 12);
        String serial = validaciones.validarTexto("\nIngrese el serial del equipo:", 1, 20);
        String marca = validaciones.validarMarca("Ingrese la marca:");
        String almacenamiento = validaciones.validarAlmacenamiento();
        
        

        EstudianteDiseño estudiante = new EstudianteDiseño(cedula, nombre, apellido, telefono, serial, modalidad, asignaturas);
        gestionPrestamos.registrarPrestamo(estudiante);
    }

    public void modificarPrestamo(String tipoEstudiante) {
        System.out.println("Ingrese el serial del equipo a modificar:");
        String serial = validaciones.validarTexto("Serial del equipo:", 1, 20);

        if (tipoEstudiante.equals("ingenieria")) {
            System.out.println("Ingrese los nuevos datos del estudiante de ingeniería:");
            String cedula = validaciones.validarCedula("Cédula (8-10 números):");
            String nombre = validaciones.validarTexto("Nombre (3-30 letras):", 3, 30);
            String apellido = validaciones.validarTexto("Apellido (3-30 letras):", 3, 30);
            String telefono = validaciones.validarTelefono("Teléfono (7-12 números):");
            int semestre = validaciones.validarEntero("Número de semestre (1-30):", 30);
            float promedio = validaciones.validarFloat("Promedio (0.0 hasta 5.0):");

            EstudianteIngenieria nuevoEstudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, serial, semestre, promedio);
            gestionPrestamos.modificarPrestamo(serial, nuevoEstudiante);
        } else if (tipoEstudiante.equals("diseno")) {
            System.out.println("Ingrese los nuevos datos del estudiante de diseño:");
            String cedula = validaciones.validarCedula("Cédula (8-10 números):");
            String nombre = validaciones.validarTexto("Nombre (3-30 letras):", 3, 30);
            String apellido = validaciones.validarTexto("Apellido (3-30 letras):", 3, 30);
            String telefono = validaciones.validarTelefono("Teléfono (7-12 números):");
            String modalidad = validaciones.validarModalidad();
            int asignaturas = validaciones.validarEntero("Cantidad de asignaturas (1-12):", 12);

            EstudianteDiseño nuevoEstudiante = new EstudianteDiseño(cedula, nombre, apellido, telefono, serial, modalidad, asignaturas);
            gestionPrestamos.modificarPrestamo(serial, nuevoEstudiante);
        }
    }

    public void devolucionEquipo() {
        System.out.println("Ingrese el serial del equipo a devolver:");
        String serial = validaciones.validarTexto("Serial del equipo:", 1, 20);
        gestionPrestamos.devolucionEquipo(serial);
    }

    public void buscarEquipo() {
        System.out.println("Ingrese el serial del equipo a buscar:");
        String serial = validaciones.validarTexto("Serial del equipo:", 1, 20);
        gestionPrestamos.buscarEquipo(serial);
    }
}


