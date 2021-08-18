
package Sorts;

import java.util.Scanner;

public class InsertionSort {

    /**
     *Em um array existente, o novo numero inserido é comparado com os outros do vetor e realocado de acordo com o tamanho
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
         int[]teste={10,29,93,1,39,2,231,9,5,23,0};
         
         for(int i=0;i<teste.length;i++){
             for(int j=i+1;j<teste.length;j++){
                 int menor = teste[i];
                 if(menor>teste[j]){
                     teste[i]=teste[j];
                     teste[j]=menor;
                 }
             }
         }
         
          
     
        teste[10]= leitor.nextInt();
        
        for(int i=0;i<teste.length;i++){
             for(int j=i+1;j<teste.length;j++){
                 int menor = teste[i];
                 if(menor>teste[j]){
                     teste[i]=teste[j];
                     teste[j]=menor;
                 }
             }
         }
         
         
        
          
        for(int i=0;i<teste.length;i++){
            System.out.println("");
            System.out.println(teste[i]);
        }
         
    }
    
}
