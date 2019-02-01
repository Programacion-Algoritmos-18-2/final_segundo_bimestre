/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_ordenar;

import java.util.Random;

/**
 *
 * @author reroes
 */
public class Datos {
    public int[] valores;
    
    public Datos(){
        valores = llenarValores();
    }
        
    private int[] llenarValores(){
        int[] tmp_valores = new int[100];
        
        // generar datos de ejemplo
        Random generador = new Random();
        for(int i=0; i<100; i++){
            tmp_valores[i] = generador.nextInt(900);
        }
        valores = tmp_valores;
        return valores;
    }
    
    public int[] obtener_valores(){
        return valores;
    }
    
    public String toString() {
        String temporal = "";

        for (int elemento : valores) {
            temporal = String.format("%s %s", temporal, elemento);
        }

        temporal = String.format("%s%s", temporal, "\n");
        return temporal;
    }
    
}
