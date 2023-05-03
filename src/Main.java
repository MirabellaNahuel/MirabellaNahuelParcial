import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Silla("silla s/ ruedas", 50, 100d, false);
        Producto p2 = new Silla("silla c/ ruedas", 100, 1000d, true);
        Producto p3 = new Escritorio("escritorio chico", 50, 500d, 2.72, 0.76);
        Producto p4 = new Escritorio("escritorio grande", 100, 1000d,3.532, 0.93);
        Producto p5 = new Notebook("notebook oficina", 50, 700d, "Samsung", 8d);
        Producto p6 = new Notebook("notebook gamer", 100, 1500d, "Asus", 32d);
        Producto p7 = new Impresora("impresora chica", 50, 400d, "Epson", 4);
        Producto p8 = new Impresora("impresora grande", 100, 850d, "HP", 10);
        List<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        Scanner teclado = new Scanner(System.in);
        Integer opcion;
        Integer opcion2;
        Double descuento;
        Impresora imp = null;
        Silla silla=null;

        do {
            menu();
            System.out.println("Precione un numero menor a 0, o mayor a 3 para salir");
            System.out.println("Seleccione una opcion... ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    for (Producto prod: productos) {
                        System.out.println(muestraInstaciaDeProducto(prod));
                    }

                    break;
                case 2:
                    menu2();
                    opcion2= teclado.nextInt();
                    teclado.nextLine();
                    switch (opcion2){
                        case 1:
                            imp=getImpresora(productos);
                            System.out.println("Ingrese descuento: ");
                            descuento= teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("El precio de la Impresora era de: "+ imp.getPrecio());
                            System.out.println("Con el descuento aplicado pasa a ser de: "+ imp.descuento(descuento));
                            break;
                        case 2:
                            silla=getSilla(productos);
                            System.out.println("Ingrese descuento: ");
                            descuento= teclado.nextDouble();
                            teclado.nextLine();
                            System.out.println("El precio de la Silla era de: "+ silla.getPrecio());
                            System.out.println("Con el descuento aplicado pasa a ser de: "+ silla.descuento(descuento));
                    }

                    break;
                case 3:
                    for (Producto prod: productos) {
                        System.out.println(actDePrecio(prod));
                    }

                    break;
            }

        }while(opcion>0 && opcion<4);


    }
    public static Impresora getImpresora(List<Producto> productos){
        Impresora imp=null;
        Integer i=0;
        while(imp==null && i<productos.size()){
            if (productos.get(i) instanceof Impresora){
                imp= (Impresora) productos.get(i);
            }
            i++;
        }
        return imp;
    }
    public static Silla getSilla(List<Producto> productos){
        Silla silla=null;
        Integer i=0;
        while(silla==null && i<productos.size()){
            if (productos.get(i) instanceof Silla){
                silla= (Silla) productos.get(i);
            }
            i++;
        }
        return silla;
    }
    public static void menu(){
        System.out.println("1- Mostrar por pantalla el tipo de instancia.");
        System.out.println("2- Descuento para sillas e impresoras");
        System.out.println("3- Actualizar precios de los productos");
    }
    public static void menu2(){
        System.out.println("Que quiere comprar: ");
        System.out.println("1- Impresora");
        System.out.println("2- Silla");
    }
    public static String muestraInstaciaDeProducto(Producto prod){
        String instancia="";
        instancia="EL TIPO DE INSTANCIA ES: "+ prod.getClass().getSimpleName() + " QUE REPRESENTA AL PRODUCTO: "+prod.getNombre();
        return instancia;
    }
    public static String actDePrecio(Producto prod){
        String actualizacion="";
        Double precioViejo= prod.getPrecio();
        prod.actualizacionDePrecios();
        actualizacion="El precio viejo de: "+prod.getNombre()+" era de: "+precioViejo +"\n"+"El nuevo precio es de: "+ prod.getPrecio();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        return actualizacion;
    }
}