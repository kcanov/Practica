package practica;

import java.util.Scanner;

public class Auxiliar {

    private final GestionPrestamos gestionPrestamos = new GestionPrestamos();
    private final Validaciones validaciones = new Validaciones();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú principal:"
                +"\n1. ESTUDIANTES DE INGENIERIA."
                +"\n2. ESTUDIANTES DE DISEÑO."
                +"\n3. IMPRIMIR INVENTARIO TOTAL."
                +"\n4. SALIR DEL PROGRAMA.");
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
            System.out.println("Menú estudiantes de Ingeniería:"
                +"\n1.1 Registrar préstamo de equipo."
                +"\n1.2 Modificar préstamo de equipo."
                +"\n1.3 Devolución de equipo."
                +"\n1.4 Buscar equipo."
                +"\n1.5 Volver al menú principal.");

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
            System.out.println("Menú estudiantes de Diseño:"
                    +"\n2.1 Registrar préstamo de equipo."
                    +"\n2.2 Modificar préstamo de equipo."
                    +"\n2.3 Devolución de equipo."
                    +"\n2.4 Buscar equipo."
                    +"\n2.5 Volver al menú principal.");

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
    String sistemaOperativo = elegirSistemaOperativo();
    String procesador = elegirProcesador();
    String marca = validaciones.validarTexto("\nIngrese la marca del equipo (2-30 letras):", 2, 30);
    float tamaño = validaciones.validarFloatT("\nIngrese el tamaño del equipo en pulgadas (0.0 hasta 20.0):");
    float precio = validaciones.validarFloatP("\nIngrese el precio del equipo:");

    EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, serial, semestre, promedio, sistemaOperativo, procesador, marca, tamaño, precio);
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
        String marca = validaciones.validarTexto("\nIngrese la marca del equipo (2-30 letras):", 2, 30);
        String almacenamiento = elegirAlmacenamiento();
        float tamaño = validaciones.validarFloatT("\nIngrese el tamaño del equipo en pulgadas (0.0 hasta 20.0):");
        float peso = validaciones.validarFloat("\nIngrese el peso del equipo en kg (0.0 hasta 5.0):");
        float precio = validaciones.validarFloatP("\nIngrese el precio del equipo:");

        EstudianteDiseño estudiante = new EstudianteDiseño(cedula, nombre, apellido, telefono, serial, modalidad, asignaturas, marca, almacenamiento, tamaño, peso, precio);
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
            String sistemaOperativo = elegirSistemaOperativo();
            String procesador = elegirProcesador();
            String marca = validaciones.validarTexto("Marca (2-30 letras):", 2, 30);
            float tamaño = validaciones.validarFloatT("Tamaño del equipo en pulgadas (0.0 hasta 20.0):");
            float precio = validaciones.validarFloatP("Precio del equipo:");

            EstudianteIngenieria nuevoEstudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, serial, semestre, promedio, sistemaOperativo, procesador, marca, tamaño, precio);
            gestionPrestamos.modificarPrestamo(serial, nuevoEstudiante);
        } else if (tipoEstudiante.equals("diseno")) {
            System.out.println("Ingrese los nuevos datos del estudiante de diseño:");
            String cedula = validaciones.validarCedula("Cédula (8-10 números):");
            String nombre = validaciones.validarTexto("Nombre (3-30 letras):", 3, 30);
            String apellido = validaciones.validarTexto("Apellido (3-30 letras):", 3, 30);
            String telefono = validaciones.validarTelefono("Teléfono (7-12 números):");
            String modalidad = validaciones.validarModalidad();
            int asignaturas = validaciones.validarEntero("Cantidad de asignaturas (1-12):", 12);
            String marca = validaciones.validarTexto("Marca (2-30 letras):", 2, 30);
            String almacenamiento = elegirAlmacenamiento();
            float tamaño = validaciones.validarFloat("Tamaño del equipo en pulgadas (0.0 hasta 20.0):");
            float peso = validaciones.validarFloat("Peso del equipo en kg (0.0 hasta 5.0):");
            float precio = validaciones.validarFloat("Precio del equipo:");

            EstudianteDiseño nuevoEstudiante = new EstudianteDiseño(cedula, nombre, apellido, telefono, serial, modalidad, asignaturas, marca, almacenamiento, tamaño, peso, precio);
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

    public String elegirSistemaOperativo() {
        System.out.println("Seleccione el sistema operativo:"
                +"\n1. Windows 7"
                +"\n2. Windows 10"
                +"n3. Windows 11");
        int opcion = validaciones.validarEntero("Seleccione una opción (1-3):", 3);
        switch (opcion) {
            case 1:
                return "Windows 7";
            case 2:
                return "Windows 10";
            case 3:
                return "Windows 11";
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return elegirSistemaOperativo();
        }
    }

    public String elegirProcesador() {
        System.out.println("Seleccione el procesador:"
            +"1. AMD Ryzen"
            +"2. Intel® Core™ i5");
        int opcion = validaciones.validarEntero("Seleccione una opción (1-2):", 2);
        switch (opcion) {
            case 1:
                return "AMD Ryzen";
            case 2:
                return "Intel® Core™ i5";
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return elegirProcesador();
        }
    }
    
    public String validarMarca(String mensaje) {
        System.out.println(mensaje);
        while (true) {
            String marca = scanner.nextLine().trim();
            if (marca.matches("[a-zA-Z ]+")) {
                return marca;
            } else {
                System.out.println("Marca inválida. Intente nuevamente.");
            }
        }
    }

    public String elegirAlmacenamiento() {
        System.out.println("Seleccione el almacenamiento:"
            +"\n1. 256 GB"
            +"\n2. 512 GB"
            +"\n3. 1 TB");
        int opcion = validaciones.validarEntero("Seleccione una opción (1-3):", 3);
        switch (opcion) {
            case 1:
                return "256 GB";
            case 2:
                return "512 GB";
            case 3:
                return "1 TB";
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                return elegirAlmacenamiento();
        }
    }
}
