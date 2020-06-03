package com.testAutomationCoach.aAbstraccion;

public class Perro {
    //variables de instancia, tamano, raza, nombre
    public double tamanio;
    public String raza;
    public String nombre;

    public Perro (double tamanio, String raza, String nombre)
    {
        this.tamanio = tamanio;
        this.raza = raza;
        this.nombre = nombre;
    }

    //comportamiento: ladrar, juguetear, comer, etc.

    public void ladrar() {
        System.out.println("Guau Guau");
    }
    public void correr() {
        System.out.println("*Jadear");
    }
    public void comer() {}
}
