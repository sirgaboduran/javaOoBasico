package com.testAutomationCoach.aEscuela;

public class Prefecto extends Personal
{
    protected char turno;
    protected String edificio;

    public Prefecto(String nombre, String apellidoPaterno, String apellidoMaterno, String titulo, int edad, double salario, char turno, String edificio)
    {
        super(nombre, apellidoPaterno, apellidoMaterno, titulo, edad, salario);
        this.turno = turno;
        this.edificio = edificio;
    }

    public char getTurno()
    {
        return turno;
    }

    public void setTurno(char turno)
    {
        this.turno = turno;
    }

    public String getEdificio()
    {
        return edificio;
    }

    public void setEdificio(String edificio)
    {
        this.edificio = edificio;
    }
}
