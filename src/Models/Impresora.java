package Models;

import Interfaces.Beneficios;

public class Impresora extends ProductoInformatico implements Beneficios {
    private Integer impXMinuto;

    public Impresora() {
    }

    public Impresora(Integer impXMinuto) {
        this.impXMinuto = impXMinuto;
    }

    public Impresora(String nombreFabricante, Integer impXMinuto) {
        super(nombreFabricante);
        this.impXMinuto = impXMinuto;
    }

    public Impresora(String nombre, Integer stock, Double precio, String nombreFabricante, Integer impXMinuto) {
        super(nombre, stock, precio, nombreFabricante);
        this.impXMinuto = impXMinuto;
    }

    public Integer getImpXMinuto() {
        return impXMinuto;
    }

    public void setImpXMinuto(Integer impXMinuto) {
        this.impXMinuto = impXMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" + super.toString()+" "+
                "impXMinuto=" + impXMinuto +
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
        super.setPrecio(super.getPrecio()+(super.getPrecio()*0.15));
    }
}
