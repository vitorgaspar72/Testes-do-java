
package Sorts;



public class SelectionSort {

    /**
     * @trocam os elementos de acordo com a seleção
     */
    public static void main(String[] args) {
        int[]teste={10,29,93,1,39,2,231,9,1239,23};       //vai ordenar do menor para o maior
       
        for(int i=0;i<teste.length;i++){
            for(int j=i+1;j<teste.length;j++){
                int menor=teste[i]; //variavel externa que recebe o valor se a casa anterior for maior que a proxima
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