/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arregloobjetoss;

/**
 *
 * @author estef
 */
//creamos los sett y gett
public class Habitaciones {

    private String Estado;
    private int numero;
    private String tipo;
    private int precio;

    public Habitaciones(String Estado, int numero, String tipo, int precio) {
        this.Estado = Estado;
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Habitaciones() {
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
