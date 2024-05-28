package practica;

import java.util.Scanner;

public class Validaciones {
    private final Scanner scanner = new Scanner(System.in);

    public int validarEntero(String mensaje, int maximo) {
    int numero;
    do {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        numero = scanner.nextInt();
        scanner.nextLine();
        if (numero < 1 || numero > maximo) {
            System.out.println("El número debe estar entre 1 y " + maximo + ". Intente nuevamente.");
        }
    } while (numero < 1 || numero > maximo);
    return numero;
}

    public float validarFloat(String mensaje) {
    System.out.println(mensaje);
    while (true) {
        try {
            String input = scanner.nextLine();
            float numero = Float.parseFloat(input);
            if (numero >= 0.0 && numero <= 5.0) {
                return numero;
            } else {
                System.out.println("El número debe estar entre 0.0 y 5.0. Intente nuevamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Intente nuevamente.");
        }
    }
}
    
    public float validarFloatT(String mensaje) {
    System.out.println(mensaje);
    while (true) {
        try {
            String input = scanner.nextLine();
            float numero = Float.parseFloat(input);
            if (numero >= 0.0 && numero <= 20.0) {
                return numero;
            } else {
                System.out.println("El número debe estar entre 0.0 y 20.0, Intente nuevamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Intente nuevamente.");
        }
    }
}
    
    public float validarFloatP(String mensaje) {
    System.out.println(mensaje);
    while (true) {
        try {
            String input = scanner.nextLine();
            float numero = Float.parseFloat(input);
            if (numero >= 0.0 && numero <= 10000000000.0) {
                return numero;
            } else {
                System.out.println("El número debe estar entre 0.0 y 10000000000.0, Intente nuevamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Intente nuevamente.");
        }
    }
}
    
    

    public String validarTexto(String mensaje, int min, int max) {
        String input;
        do {
            System.out.println(mensaje);
            input = scanner.nextLine();
            if (!input.matches("[a-zA-Z ]{" + min + "," + max + "}")) {
                System.out.println("Entrada inválida. Intente nuevamente.");
            }
        } while (!input.matches("[a-zA-Z ]{" + min + "," + max + "}"));
        return input;
    }

    public String validarCedula(String mensaje) {
        String cedula;
        do {
            System.out.println(mensaje);
            cedula = scanner.nextLine();
            if (!cedula.matches("\\d{8,10}")) {
                System.out.println("Cédula inválida. Intente nuevamente.");
            }
        } while (!cedula.matches("\\d{8,10}"));
        return cedula;
    }

    public String validarTelefono(String mensaje) {
        String telefono;
        do {
            System.out.println(mensaje);
            telefono = scanner.nextLine();
            if (!telefono.matches("\\d{7,12}")) {
                System.out.println("Teléfono inválido. Intente nuevamente.");
            }
        } while (!telefono.matches("\\d{7,12}"));
        return telefono;
    }

    public String validarModalidad() {
        String modalidad = "";
        do {
            System.out.println("Seleccione la modalidad de estudio:"
                    +"\n1. Virtual"
                    +"\n2. Presencial\n");
            int opcion = validarEntero("Seleccione una opción (1 o 2):", 2);
            switch (opcion) {
                case 1:
                    modalidad = "virtual";
                    break;
                case 2:
                    modalidad = "presencial";
                    break;
                default:
                    System.out.println("Entrada inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (!modalidad.equals("virtual") && !modalidad.equals("presencial"));
        return modalidad;
    }
    
}
