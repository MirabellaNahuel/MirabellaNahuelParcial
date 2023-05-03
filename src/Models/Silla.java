package Models;

import Interfaces.Beneficios;

public class Silla extends Producto implements Beneficios {
    private Boolean reudas;

    public Silla() {
    }

    public Silla(Boolean reudas) {
        this.reudas = reudas;
    }

    public Silla(String nombre, Integer stock, Double precio, Boolean reudas) {
        super(nombre, stock, precio);
        this.reudas = reudas;
    }

    public Boolean getReudas() {
        return reudas;
    }

    public void setReudas(Boolean reudas) {
        this.reudas = reudas;
    }

    @Override
    public String toString() {
        return "Silla{" + super.toString() + " " +
                "reudas=" + reudas +
                '}';
    }

    @Override
    public Double descuento(Double desc) {
        desc=desc/100;
        Double nuevoPrecio;
        nuevoPrecio=super.getPrecio()-(super.getPrecio()*desc);
        return nuevoPrecio;
    }

    @Override
    public void actualizacionDePrecios() {
        super.setPrecio(super.getPrecio()+(super.getPrecio()*0.05));
    }
}
