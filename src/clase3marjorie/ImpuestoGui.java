/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3marjorie;
//import java.util.Scanner;
//paquete para implementar ventanas graficas de usuarios
import javax.swing.JOptionPane;

/**
 *
 * @author LAB10
 */
public class ImpuestoGui
        
        
{
   
 
     
 
 public static void main(String[] args)
 {
  int sueldo;
  //Scanner escaner = new Scanner(System.in);
  //System.out.println("ingrese su salario:");
  //convertimos el string a entero antes de guardarlo
  sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese du salario"));
          
   //sueldo = escaner.nextInt();
  if (sueldo>600000)
  {
   // System.out.println("Debe Pagar Impuestos");
      JOptionPane.showMessageDialog(null,"debe pagar impuesto");
  }   
 }      
}
