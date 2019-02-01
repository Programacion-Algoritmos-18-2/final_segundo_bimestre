package paquete_ordenar;

import java.util.Random;

public class OrdenamientoPorSeleccion {

    int[] datos; 

    public OrdenamientoPorSeleccion(int[] misvalores) {
        datos = misvalores;
    } 

   
    public void ordenar_datos() {
        int masPequenio; 

        for (int i = 0; i < datos.length - 1; i++) {
            masPequenio = i; 

            for (int indice = i + 1; indice < datos.length; indice++) {
                if (datos[indice] < datos[masPequenio]) {
                    masPequenio = indice;
                }
            }

            intercambiar(i, masPequenio); 
            System.out.println(toString());
        } 
    } 

    public void intercambiar(int primero, int segundo) {
        int temporal = datos[primero]; 
        datos[primero] = datos[segundo]; 
        datos[segundo] = temporal; 
    } 

    public String toString() {
        String temporal = "";

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal = String.format("%s %s", temporal, elemento);
        }

        temporal = String.format("%s%s", temporal, "\n");
        return temporal;
    } // fin del m�todo toString
} // fin de la clase OrdenamientoSeleccion


/**************************************************************************
 * Tomado de:
 * 
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * 
 *************************************************************************/
