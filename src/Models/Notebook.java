package Models;

public class Notebook extends ProductoInformatico{
    private Double cantDeMemoria;

    public Notebook() {
    }

    public Notebook(Double cantDeMemoria) {
        this.cantDeMemoria = cantDeMemoria;
    }

    public Notebook(String nombreFabricante, Double cantDeMemoria) {
        super(nombreFabricante);
        this.cantDeMemoria = cantDeMemoria;
    }

    public Notebook(String nombre, Integer stock, Double precio, String nombreFabricante, Double cantDeMemoria) {
        super(nombre, stock, precio, nombreFabricante);
        this.cantDeMemoria = cantDeMemoria;
    }

    public Double getCantDeMemoria() {
        return cantDeMemoria;
    }

    public void setCantDeMemoria(Double cantDeMemoria) {
        this.cantDeMemoria = cantDeMemoria;
    }

    @Override
    public String toString() {
        return "Notebook{" + super.toString()+" "+
                "cantDeMemoria=" + cantDeMemoria +
                '}';
    }
    @Override
    public void actualizacionDePrecios() {
        super.setPrecio(super.getPrecio()+(super.getPrecio()*0.20));
    }
}
