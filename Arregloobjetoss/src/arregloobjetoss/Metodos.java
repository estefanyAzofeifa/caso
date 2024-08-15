/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arregloobjetoss;

import javax.swing.JOptionPane;

/**
 *
 * @author estef
 */
//creamos el metodo de completar para hacer una matriz con elementos
public class Metodos {

    private Habitaciones hotel[][] = new Habitaciones[3][3];

    public void completarHabitaciones() {
        hotel[0][0] = new Habitaciones("ocupada", 101, "simple", 25);
        hotel[0][1] = new Habitaciones("Libre", 101, "simple", 28);
        hotel[0][2] = new Habitaciones(" Libre", 102, "simple", 45);
        hotel[1][0] = new Habitaciones("ocupada", 103, "simple", 15);
        hotel[1][1] = new Habitaciones("Libre", 104, "simple", 24);
        hotel[1][2] = new Habitaciones("Libre", 105, "simple", 33);
        hotel[2][0] = new Habitaciones("Libre", 106, "simple", 30);
        hotel[2][1] = new Habitaciones("Libre", 107, "simple", 30);
        hotel[2][2] = new Habitaciones("Libre", 108, "simple", 30);
    }

    public void agregarHabitaciones() {
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel.length; j++) {
                Habitaciones h = new Habitaciones();
                h.setEstado(JOptionPane.showInputDialog(null, ""));
                h.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad existente:")));
                h.setTipo(JOptionPane.showInputDialog(null, "Digite el precio del producto:"));
                h.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del producto:")));
                hotel[i][j] = h;
            }
        }
    }
    //creamos este metodo para mostrar en la pantalla la matriz creada anteriormente

    public void visualizacionHabitaciones() {
        String h = "";
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel.length; j++) {
                h = h + (i + 1) + " " + "Estado" + " " + hotel[i][j].getEstado() + " " + "Numero habitacion" + " " + hotel[i][j].getNumero()
                        + " " + "Tipo de Habitacion" + " " + hotel[i][j].getTipo() + " " + "Precio" + " " + hotel[i][j].getPrecio() + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, "habitaciones del hotesl:\n" + h);
    }
    //se crea este metodo, para poder ingresar a la matriz y hacer lo deseado

    public void modificarHabitacion() {
        Habitaciones h = new Habitaciones();
        int num;
        int pisoHotel;
        String nuevoEstado;
        String nuevoTipo;
        int nuevoPrecio;
        pisoHotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de habitacion que desea modificar"));
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de habitacion que desea modificar"));
        nuevoEstado = JOptionPane.showInputDialog(null, "Ingrese el nuevo estado de habitación");
        nuevoTipo = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de habitacion");
        nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo valor por noche"));
        hotel[(pisoHotel - 1)][(num - 1)] = new Habitaciones(nuevoEstado, h.getNumero(), nuevoTipo, nuevoPrecio);
        JOptionPane.showMessageDialog(null, "La información a sido modificada");
    }
    //mostramps el resumen con los metodos que se deben realizar

    public void resumen() {
        Habitaciones h = new Habitaciones();
        int totalLimpias = 0;
        int totalSucias = 0;
        int totalOcupadas = 0;
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel.length; j++) {
                if (h.getEstado() == "Libre") {
                    totalLimpias = totalLimpias + 1;

                } else if (h.getEstado() == "Ocupada") {
                    totalOcupadas = totalOcupadas + 1;
                } else if (h.getEstado() == "Sucia") {
                    totalSucias = totalSucias + 1;
                }
                JOptionPane.showMessageDialog(null, "las habitaciones libres son :" + totalLimpias);
                JOptionPane.showMessageDialog(null, "las habitaciones ocupadas son:" + totalOcupadas);
                JOptionPane.showMessageDialog(null, "las habitaciones sucias son:" + totalSucias);
                int TotalGanancias = 0;

                TotalGanancias = totalOcupadas * h.getPrecio();

                JOptionPane.showInternalMessageDialog(null, "La ganancia del hotel es de:" + TotalGanancias);
            }
        }

    }

}
