
 package Operadores;
 
 import javax.swing.JOptionPane;

public class Navidad {
    public static void main (String[] args){
        int dia, mes;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        
        if (dia == 25 && mes == 12) {
            JOptionPane.showInputDialog("La fecha ingresada corresponde a navidad");
        } else {
            JOptionPane.showInputDialog("La fecha ingresada no corresponde a navidad");
        }
    }
}
