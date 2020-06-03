package com.testAutomationCoach.cMethods;

public class EjemploGuitarra
{
    public static void main(String[] args)
    {
        Guitarrista[] listaGuitarristas = new Guitarrista[2];
        Guitarrista jimmyPage = new Guitarrista("Jimmy Page", "Led Zeppelin");
        Guitarrista slash = new Guitarrista("Slash", "Guns and Roses");

        listaGuitarristas[0] = jimmyPage;
        listaGuitarristas[1] = slash;

        GuitarraElectrica gibsonLesPaul = new GuitarraElectrica("Gibson", "Les Paul", listaGuitarristas);
    }
}
