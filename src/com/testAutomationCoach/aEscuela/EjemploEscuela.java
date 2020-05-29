package com.testAutomationCoach.aEscuela;

public class EjemploEscuela
{
    public static void main(String[] args)
    {
    Alumno gabo = new Alumno();
    gabo.nombre = "Luis Gabriel";
    gabo.apellidoPaterno = "Duran";
    gabo.apellidoMaterno = "Barrios";
    gabo.grado = 1;
    gabo.edad = 32;
    gabo.grupo = 'a';

    Alumno erica = new Alumno();

    Maestro caro  = new Maestro();
    Maestro omar = new Maestro();

    Salon virtual = new Salon();
    Edificio watson = new Edificio();
    Bano baño = new Bano();
    Prefecto martha = new Prefecto();

    Escuela cervantes = new Escuela();
    cervantes.edificios = new Edificio[2];
    cervantes.edificios[0] = watson;
    cervantes.edificios[1] = new Edificio();

    //cervantes.personal = new Maestro[2];
    //cervantes.personal[0] = caro;
    //cervantes.personal[1] = omar;
   // cervantes.personal = new Prefecto[1];
   // cervantes.personal[0] = martha;

    virtual.grupos = new Grupo(1);
    Salon primeroA = new Salon();

    Grupo g = new Grupo();
    g.alumnos = new Alumno[2];
    g.alumnos[0] = gabo;
    g.alumnos[1] = erica;

    virtual.grupos[0] = g;

    g.maestros = new Maestro[3];
    g.maestros[0] = omar;
    g.maestros[1] = caro;

    }
}
