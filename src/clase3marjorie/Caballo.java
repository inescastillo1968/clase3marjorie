/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3marjorie;

/**
 *
 * @author LAB10
 */
public class Caballo
{
    //Declaracion de atributos de clase
   String altura;
   String color;
   String peso;
   String raza;
   int patas = 4, edad;
         
   //Metodo Constructor
   public Caballo(String nuevoNombre)
   {
      raza = nuevoNombre; 
       
   }
   //metodo get set de clase
   public void relinchar()
   {
       
   }
   //metodo para obtener la raza del caballo
     public String obtenerRaza() 
     {
   //sentencia obligatoria de retorno
         return raza;


}
     public int obtenerEdad()
     {
    //sentencia obligatoria de retorno
         return edad;
}
   
}
