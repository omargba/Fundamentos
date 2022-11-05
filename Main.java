/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likenlist;

import javax.swing.JOptionPane;

/**
 *
 * @author OMAR
 */
public class Main {
    public static void main(String[] args) {
    SinglyLinkedList lista = new SinglyLinkedList();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar inicio "
                        + "2. Agregar final"
                        + "3. Mostrar inicio a fin"
                        + "4. Mostrar fin a inicio"
                        + "5. Eliminar node inicio"
                        + "6. Eliminar node final"
                        + "7. Salir"
                        + "Que deseas hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.addStart(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.addEnd(elemento);
                        break;
                    case 3:
                        if (!lista.empty()) {
                            lista.showLisStartEndt();
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!lista.empty()) {
                            lista.showListEndStart();
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!lista.empty()) {
                            elemento = lista.deletionStart();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 6:
                        if (!lista.empty()) {
                            elemento = lista.deleteEnd();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "no hay nodos aun",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no registrada",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }
    
}
