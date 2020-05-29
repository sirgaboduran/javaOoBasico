package com.testAutomationCoach.aAbstraccion;

public class Articulo
{
    String nombre;
    String idenfiticador;
    double codigoBarras;
    double precio;
    String unidadDeMedida;
    double cantidad;
    String categoría;
    String descripcion;
    boolean caducidad;
    int fechaCaducidad;


    public void agregarCarrito(String nombre, String idenfiticador, double codigoBarras, double cantidad, String unidadDeMedida, double precio, String categoría, String descripcion, boolean caducidad, int fechaCaducidad)
    {
        this.nombre = nombre;
        this.idenfiticador = idenfiticador;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.unidadDeMedida = unidadDeMedida;
        this.cantidad = cantidad;
        this.categoría = categoría;
        this.descripcion = descripcion;
        this.caducidad = caducidad;
        this.fechaCaducidad = fechaCaducidad;
    }
    public void buscarArticulo(String nombre, String idenfiticador, double codigoBarras)
    {
        this.nombre = nombre;
        this.idenfiticador = idenfiticador;
        this.codigoBarras = codigoBarras;
    }
    public void quitarCarrito()
    {

    }
    public void comprarArticulo()
    {

    }

}
