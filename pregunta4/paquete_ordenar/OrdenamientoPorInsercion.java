package paquete_ordenar;

import java.util.Random;

public class OrdenamientoPorInsercion
{
   private int[] datos; // arreglo de valores

   public OrdenamientoPorInsercion( int [] losvalores )
   {
      datos = losvalores;
   } 

   public void ordenar_informacion()
   {
      int insercion; 

      for ( int siguiente = 1; siguiente < datos.length; siguiente++ )
      {
         insercion = datos[ siguiente ]; 

         int moverElemento = siguiente; 

         // busca un lugar para colocar el elemento actual
         while ( moverElemento > 0 && datos[ moverElemento - 1 ] > insercion )
         {
            // desplaza el elemento una posici�n a la derecha
            datos[ moverElemento ] = datos[ moverElemento - 1 ];
            moverElemento--;
         } // fin de while

         datos[ moverElemento ] = insercion; // coloca el elemento insertado
         System.out.println(toString());
      } 
   } 

   
    public String toString() {
        String temporal = "";

        for (int elemento : datos) {
            temporal = String.format("%s %s", temporal, elemento);
        }

        temporal = String.format("%s%s", temporal, "\n");
        return temporal;
    } 
} // fin de la clase OrdenamientoInsercion


/**************************************************************************
 * Tomado de:
 * 
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * 
 *************************************************************************/
