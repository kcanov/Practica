package practica;

import java.util.Scanner;

public class CompuPortatil {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private String sistemaOperativo;
    private String procesador;

    public CompuPortatil(String serial, String marca, float tamaño, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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

    

    public String elegirSistemaOperativo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo:"
            +"\n1. Windows 7"
            +"\n2. Windows 10"
            +"\n3. Windows 11");
        int opcion = scanner.nextInt();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el procesador:"
            +"\n1. AMD Ryzen"
            +"\n2. Intel® Core™ i5");
        int opcion = scanner.nextInt();
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
}
