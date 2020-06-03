package com.testAutomationCoach.bVariables;

class Book {
    String title;
    String author;
}


class BookTestDrive {
    public static void main(String [] args) {


        Book [] myBooks = new Book[3]; // Crea un arreglo de 3 libros
        int x = 0; // Asigna valor de 0 a "x"

        // Da error. Lo siguiente se haria, siempre y cuando fueran creado los objetos previamente
        myBooks[0].title = "The Grapes of Java"; // Asigna titulo a libro 1
        myBooks[1].title = "The Java Gatsby"; // Asigna titulo a libro 2
        myBooks[2].title = "The Java Cookbook"; // Asigna titulo a libro 3
        myBooks[0].author = "bob"; // Asigna autor a libro 1
        myBooks[1].author = "sue"; // Asigna autor a libro 2
        myBooks[2].author = "ian"; // Asigna autor a libro 3


        while (x < 3) { // ciclo hasta la cantidad de numero de libros
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        } // Imprime el titulo del libro y su autor previamente asignados
    }
}
