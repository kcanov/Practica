package practica;

import java.util.Scanner;

public class TabletGrafica {
    
    Validaciones validaciones = new Validaciones();
    
    private String marca;
    private float tamaño;
    private float precio;
    private String almacenamiento;
    private float peso;
    private Scanner scanner;

    public TabletGrafica(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public String toString() {
        return "TabletaGrafica{" +
                "marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", precio=" + precio +
                ", almacenamiento='" + almacenamiento + '\'' +
                ", peso=" + peso +
                '}';
    }
}

