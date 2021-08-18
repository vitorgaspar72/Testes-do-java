/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListSetMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Vitor
 */
public class SET {

    /**
     * Conjunto SET, esse tipo de conjunto nao tem ordem específica e não aceita números repetidos
     */
    public static void main(String[] args) {
        Random numeros = new Random();
        
        Set<Integer> lista =new HashSet(); // HashSet é a classe implementadora de Set
        lista.add(numeros.nextInt(20));
         lista.add(numeros.nextInt(20));
          lista.add(numeros.nextInt(20));
           lista.add(numeros.nextInt(20));
            lista.add(numeros.nextInt(20));
             lista.add(numeros.nextInt(20));
             
        print(lista);     
        
    }
    
    public static void print(Set<Integer> numeros){
        Iterator<Integer> leitor = numeros.iterator(); // classe que implementa leitura de dados se houver em sequencia
        while(leitor.hasNext()){
            System.out.println("\n"+leitor.next());
        }
    }
    
}
