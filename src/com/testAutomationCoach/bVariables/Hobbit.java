package com.testAutomationCoach.bVariables;

class Hobbit {


    String name;


    public static void main(String [] args) {


        Hobbit[] h = new Hobbit[3]; // Crea un arreglo de 3 hobbits
        int z = 0; // Asigna valor de 0 a variable "z"


        while (z < 4) { // Ciclo de numero de hobbits
            z = z + 1; //incrementa el valor de "z" más 1
            h[z] = new Hobbit(); // Crea un objeto tipo hobbit
            h[z].name = "bilbo"; // Asigna el nombre de bilbo
            if (z == 1) {
                h[z].name = "frodo"; // Sobreescribe el nombre de bilbo a frodo en primer objeto
            }
            if (z == 2) {
                h[z].name = "sam"; // Sobreescribe el nombre de bilbo a sam en segundo objeto
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        } // Ciclo termina en error ya que trata de ir al numero 4 de un arreglo de 3
    }
}

