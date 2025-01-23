/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.micentro.daw1.actividad16ii.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author DAW1
 */
@ToString
@Setter
@Getter
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private String password;
    private static int numPersonas = 0;
    private List<Evento> eventos = new ArrayList<>();

    public Persona(){
        Persona.numPersonas++;
        this.id = Persona.numPersonas;
    }
    public Persona(String nombre, String apellido, String dni, Date fechaNacimiento, String password) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
    }
    
    
    
    public boolean isMayorEdad(){
        GregorianCalendar gcHoy = new GregorianCalendar();
        GregorianCalendar gcFechaNacimiento = new GregorianCalendar();
        gcFechaNacimiento.setTime(this.fechaNacimiento);
        int añoActual = gcHoy.get(Calendar.YEAR);
        int añoNacimiento = gcFechaNacimiento.get(Calendar.YEAR);
        int edad = añoActual - añoNacimiento;
        if (gcHoy.get(Calendar.DAY_OF_YEAR)< gcFechaNacimiento.get(Calendar.DAY_OF_YEAR)){
            edad--;
            
        }
        return edad >= 18;
    }
    
}
