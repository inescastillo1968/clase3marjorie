/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3marjorie;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB10
 */
public class Esfera 
{
     public static void main(String[] args)
 {
  float radio, volumen;
  final float PI=3.14f;//final define una constante
  //convertimos el string a entero antes de guardarlo
 
  radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un radio"));
          
   //sueldo = escaner.nextInt();
  if (radio>0)
  {
      volumen = (4/3)*PI*(radio*radio*radio);
   // System.out.println("Debe Pagar Impuestos");
      JOptionPane.showMessageDialog(null,"El volumen de su esferaes es:"+volumen);
     
      
  }   
 }
}
