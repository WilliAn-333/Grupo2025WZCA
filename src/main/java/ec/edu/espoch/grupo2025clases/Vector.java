/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.grupo2025clases;

/**
 *
 * @author user
 */
public class Vector {
    
       private String[] vector;
    int contador;

    public Vector(String[] vector, int contador) {
        this.vector = vector;
        this.contador = contador;
    }

    public String[] getVector() {
        return vector;
    }

    public int getContador() {
        return contador;
    }

   public Vector(){
        vector= new String[16];
        contador=0;
   }
    
   public void guarDatos(String participante) {
        if (contador < vector.length) {
            vector[contador] = participante;
            contador++;
        }
    }
   
   //Ver datos
   
   public String verDatos(int i){
       return vector[i];
   }
    
}
