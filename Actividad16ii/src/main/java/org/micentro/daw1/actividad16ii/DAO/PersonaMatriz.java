/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.micentro.daw1.actividad16ii.DAO;

import java.util.List;
import org.micentro.daw1.actividad16ii.modelo.Persona;

/**
 *
 * @author DAW1
 */

public class PersonaMatriz implements PersonaDAO  {
    
    private static Persona[] persona = new Persona[100];
    public static int numPersonas = 0;
    
    @Override
    public Persona añadirPersona(Persona nueva) {
       if (numPersonas < persona.length){
           persona[numPersonas] = nueva;
           numPersonas++;
        }
       return nueva;
    }

    @Override
    public void eliminarPersona(int id) {
        //buscar posicion de la persona con el id recibido
        // BUSQUEDA DESORDENADA
        int i = buscarPosicionPersona(id);
        if(i != -1){
            for(i=i+1; i < numPersonas; i++){
                persona[i - 1] = persona[i];
            }
            /*for (; i< numPersonas - 1; i++){
                persona[i] = persona[i];
            }*/
            //tenemos una persona menos
            numPersonas--;
        }
    }
            //Mover los elementos desde i+1 una posición a la izquierda
            
    

    @Override
    public void modificarPersona(Persona modificar) {
    int pos = buscarPosicionPersona(modificar.getId());
    if(pos != -1){
        persona[pos] = modificar;
        }
        }

    @Override
    public List<Persona> getPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona getPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona getPersona(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int buscarPosicionPersona(int id){
        int i;
        for(i = 0; i < numPersonas &&
                id!= persona[i].getId();i++);
        if(i < numPersonas){
            return i;
        }else{
            return = 1;

    }
}
