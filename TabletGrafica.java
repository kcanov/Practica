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

    public void registrarTabletaGrafica() {
        this.marca = validaciones.validarMarca("\nIngrese la marca de la tableta gráfica:");
        this.tamaño = validaciones.validarFloat("\nIngrese el tamaño de la tableta gráfica en pulgadas:");
        this.precio = validaciones.validarFloat("\nIngrese el precio de la tableta gráfica:");
        this.almacenamiento = validaciones.validarAlmacenamiento();
        this.peso = validaciones.validarFloat("\nIngrese el peso de la tableta gráfica en kg:");
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


