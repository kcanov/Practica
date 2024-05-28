package practica;

import java.util.HashMap;
import java.util.Map;

public class GestionPrestamos {
    private Map<String, Estudiante> prestamos = new HashMap<>();

    public void registrarPrestamo(Estudiante estudiante) {
        if (prestamos.containsKey(estudiante.getSerial())) {
            System.out.println("El equipo con serial " + estudiante.getSerial() + " ya está registrado.");
        } else {
            prestamos.put(estudiante.getSerial(), estudiante);
            System.out.println("Prestamo registrado correctamente.");
        }
    }

    public void modificarPrestamo(String serial, Estudiante nuevoEstudiante) {
        if (prestamos.containsKey(serial)) {
            prestamos.put(serial, nuevoEstudiante);
            System.out.println("Prestamo modificado correctamente.");
        } else {
            System.out.println("No se encontró el equipo con el serial " + serial);
        }
    }

    public void devolucionEquipo(String serial) {
        if (prestamos.remove(serial) != null) {
            System.out.println("Devolución realizada correctamente.");
        } else {
            System.out.println("No se encontró el equipo con el serial " + serial);
        }
    }

    public void buscarEquipo(String serial) {
        Estudiante estudiante = prestamos.get(serial);
        if (estudiante != null) {
            System.out.println("Equipo encontrado: " + estudiante);
        } else {
            System.out.println("No se encontró el equipo con el serial " + serial);
        }
    }

    public void imprimirInventario() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
        } else {
            prestamos.forEach((serial, estudiante) -> {
                System.out.println("Serial: " + serial + " - Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            });
        }
    }
}
