package com.testAutomationCoach.aEscuela;

public class Maestro extends Personal{


    Grupo[] grupos;
    char turno;
    Materia [] materias;

    public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno, String titulo, int edad, double salario, Grupo[] grupos, char turno, Materia[] materias)
    {
        super(nombre, apellidoPaterno, apellidoMaterno, titulo, edad, salario);
        this.grupos = grupos;
        this.turno = turno;
        this.materias = materias;
    }

    public Grupo[] getGrupos()
    {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos)
    {
        this.grupos = grupos;
    }

    public char getTurno()
    {
        return turno;
    }

    public void setTurno(char turno)
    {
        this.turno = turno;
    }

    public Materia[] getMaterias()
    {
        return materias;
    }

    public void setMaterias(Materia[] materias)
    {
        this.materias = materias;
    }
}
