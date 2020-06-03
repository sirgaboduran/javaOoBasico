package com.testAutomationCoach.bVariables;

import com.testAutomationCoach.aAbstraccion.Perro;

public class DogArray {
    public static void main(String[] args) {
        Perro[] perrera;
        perrera = new Perro[12];
        perrera[1] = new Perro(12, "Chihuahua", "Destructor");
        perrera[2] = new Perro(30, "Danes", "Caballo");
        System.out.println(perrera[1]);
        System.out.println(perrera[2]);
        //inicializar el resto de los perros.


        //ingresar caracteristicas del perro en la primera celda
        perrera[0] = new Perro(12, "Chihuahua", "Destructor");
        perrera[0].nombre = "Solovino";

        //mover al perro de la celda 0 a la celda 3
        perrera[3] = perrera[0];
        //vaciar la celda cero
        perrera[0] = null;

    }
}
