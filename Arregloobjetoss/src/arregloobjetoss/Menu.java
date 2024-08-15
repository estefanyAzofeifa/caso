/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arregloobjetoss;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 *///creamos un menu para solicitar la informacion 
public class Menu {

    private byte opc;

    public void mostrarMenu() {
        Metodos r = new Metodos();
        r.completarHabitaciones();
        while (opc != 6) {
            opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "***MENÚ PRINCIPAL***\n\n"
                    + "1.visualizar Habitaciones\n"
                    + "2.Modificar Habitacion\n"
                    + "3.Resumen del Estado\n"
                    + "4.Salir\n"
                    + "Digite su opción:"));
            switch (opc) {
                case 1: {
                    r.visualizacionHabitaciones();
                    break;
                }
                case 2: {
                    r.modificarHabitacion();
                    break;
                }
                case 3: {
                    r.resumen();
                    break;
                }

                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }
            }
        }
    }
}
