package com.testAutomationCoach.eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud
{

    private String especialidad;

    public Doctor(String nombre, String profesion, String especialidad)
    {
        super(nombre, profesion);
        this.especialidad = especialidad;
    }

    public Doctor(String nombre, String profesion)
    {
        super(nombre, profesion);
    }

    public void prescribirMedicina()
    {

    }

    public String getEspecialidad()
    {
        return null;
    }
}
