package Models;

public abstract class ProductoInformatico extends Producto{
    private String nombreFabricante;

    public ProductoInformatico() {
    }

    public ProductoInformatico(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public ProductoInformatico(String nombre, Integer stock, Double precio, String nombreFabricante) {
        super(nombre, stock, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" + super.toString()+" "+
                "nombreFabricante='" + nombreFabricante + '\'' +
                '}';
    }
}
