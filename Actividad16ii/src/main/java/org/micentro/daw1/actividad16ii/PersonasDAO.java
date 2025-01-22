/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.micentro.daw1.actividad16ii;

import org.micentro.daw1.actividad16ii.modelo.Persona;

/**
 *
 * @author DAW1
 */
public interface PersonasDAO {
   Persona añadirPersona(Persona nueva);
   void eliminarPersona(int id);
}
