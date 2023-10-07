/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase que contiene los metodos que hace una persona
 * @author Luis Hernández
 */
public class Persona {
    private int edad;
    private String nombre, direccion;

    /**
     * Constructor vacio de persona
     */
    public Persona() {
    }

    /**
     * Constructor lleno de persona o con parametros
     * @param edad El edad de la persona en primitivo entero 
     * @param nombre El nombre ded la persona en String
     * @param direccion La direccion de la persona en String
     */
    public Persona(int edad, String nombre, String direccion) {
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Metodo que devuelve la edad
     * @return nombre Devuelve el nombre de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo modifica la edad
     * @param edad Edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que devuelve el nombre
     * @return nombre Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que modifica el nombre
     * @param nombre Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el la direccion
     * @return direccion Direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo que modifica la direccion
     * @param direccion Direccion de la persona
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Metodo que sirve para que la persona hable
     * @param c Es lo que la persona va a decir
     */
    public void hablar(String c){
        System.out.println(c);
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
