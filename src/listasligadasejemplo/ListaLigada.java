/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasligadasejemplo;

/**
 *
 * @author Alumnos
 * @param <T> Este es un tipo de dato especifico de la 
 * lista ligada
 */
public class ListaLigada<T> {
    
    private Nodo<T> p =null;
    /**
     * Este método recorre la lista, imprimiendo cada
     * valor de la misma en la pantalla
     */
    public void mostrarLista(){
      //Variable auxiliar
      Nodo<T> q = p;
      // Ciclo que recorra la lista
      while(q!=null){
          System.out.println(q.getValor());
          q=q.getLiga();
      }
    }
    
     public void insertaInicio(T obj){
        Nodo<T> t = new Nodo<>();
        t.setValor(obj);
        t.setLiga(p);
        p=t;
    }
     
    public void insertaFinal(T obj){
        //Variable auxiliar
      Nodo<T> q = p; // El nodo auxiliar para recorrer la lista
      Nodo<T> t = new Nodo<>(); // El nuevo nodo a insertar
      t.setValor(obj);
      t.setLiga(null);
      // Ciclo que recorra la lista
      if(p==null){
         p = t; 
      }else{
          while (q.getLiga() != null) {
              q = q.getLiga();
          }
      q.setLiga(t); // Asignamos a la liga del ultimo elemento, el nuevo elemento
      }
   
    } 
    
    
    
    
    
    
    
    public ListaLigada<T> invertirLista(){
      //Variable auxiliar
      ListaLigada<T> listaRetorno = new ListaLigada<>();  
      Nodo<T> q = p;
      // Ciclo que recorra la lista
      while(q!=null){
          listaRetorno.insertaInicio(q.getValor());
          //System.out.println(q.getValor());
          q=q.getLiga();
      }
      
      return listaRetorno;
    }
    
    
     public boolean buscar(T dato){
      //Variable auxiliar
      boolean resultado = false;
      Nodo<T> q = p;
      // Ciclo que recorra la lista
      while(q!=null){
          if (q.getValor().equals(dato)){
              resultado = true;
          }
          q=q.getLiga();
      }
      
      return resultado;
    }
    
    
    public void insertaAntesDeX(T nuevo, T referencia){
        Nodo<T> q = p;
        Nodo<T> s = null;
        boolean band = false;
        while(q.getLiga()!= null && !band){
          if (q.getValor().equals(referencia)){
             band = true;   
          }
          s = q;
          q = q.getLiga();
        }
        System.out.println("Band:"+band);
        System.out.println("S:"+(s==null?"null":s.getValor().toString()));
        System.out.println("Q:"+(q==null?"null":q.getValor().toString()));
        // Aca q va a estar en el valo que es, siempre y cuando band = true
    }
}
