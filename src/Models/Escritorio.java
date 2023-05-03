package Models;

public class Escritorio extends Producto{
    private Double ancho;
    private Double alto;

    public Escritorio() {
    }

    public Escritorio(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Escritorio(String nombre, Integer stock, Double precio, Double ancho, Double alto) {
        super(nombre, stock, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Escritorio{" + super.toString()+ " " +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
    @Override
    public void actualizacionDePrecios() {
        super.setPrecio(super.getPrecio()+(super.getPrecio()*0.10));
    }
}
