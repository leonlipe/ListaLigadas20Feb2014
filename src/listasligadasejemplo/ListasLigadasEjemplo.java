/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadasejemplo;

/**
 *
 * @author Alumnos
 */
public class ListasLigadasEjemplo {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Definir el inicio de la lista
       ListaLigada<String> lista = new ListaLigada<>();
       lista.mostrarLista();
       lista.insertaFinal("1");
       lista.insertaFinal("2");
       lista.insertaFinal("4");
       lista.mostrarLista();
       lista.invertirLista().mostrarLista();
        System.out.println(lista.buscar("10"));
        
       lista.insertaAntesDeX("3", "4");
        
        
    }
    
   
    
    
    
}
