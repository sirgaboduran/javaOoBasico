package com.testAutomationCoach.eHerencia.doctores;

public class ProfesionalDeSalud {

    protected String nombre;
    protected String profesion;

    public ProfesionalDeSalud(String nombre, String profesion)
    {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public void tratarPaciente()
    {
        System.out.println("Saque la lengua y diga ahhh");
        System.out.println("Pegar con el martillito en la rodilla");
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getProfesion()
    {
        return profesion;
    }

    public void setProfesion(String profesion)
    {
        this.profesion = profesion;
    }


}
