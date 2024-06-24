
package Operadores2;

import javax.swing.JOptionPane;

public class Numeros {
    public static void main (String[] args){
        int num1, num2,num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer valor: "));
        
        if (num1 < 10 && num2 < 10 && num3 < 10) {
            JOptionPane.showInputDialog("Todos los números ingresados son menores a 10.");  
        }
    }
}
