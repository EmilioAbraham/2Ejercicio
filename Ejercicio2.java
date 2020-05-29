/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author emili
 */
import javax.swing.JOptionPane;
public class Ejercicio2 {

      public static void main(String[] args) {
        // TODO code application logic here
       
        String n=JOptionPane.showInputDialog("Ingresa los dijitos a sumar");
        int suma=0;
        int num=Integer.parseInt(n);
        while(num > 0) {

            suma += num % 10;

            num /= 10;
    }
     while(suma>9){
        
           num=suma;
           suma=0;
           while(num>0){
           suma += num % 10;

            num /=  10;}
            }
            
        JOptionPane.showMessageDialog(null,"El resultado es: "+suma);
    }
    
}
