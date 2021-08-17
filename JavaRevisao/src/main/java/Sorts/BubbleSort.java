
package Sorts;



public class BubbleSort {

    /**
     * Ordenação de vetor
     */
    public static void main(String[] args) {
        
        int[] lista1 = {10,20,2,3,5,1};
        int aux;
        boolean controle;
        
        for(int i=0;i<lista1.length;i++){
            for(int j=0;j<(lista1.length-1);j++){ //Se nao colocar o -1 o vetor vai tentar acessar em baixo o local 5+1, inexistente
                if(lista1[j]>lista1[j+1]){
                    aux = lista1[j];
                    lista1[j]=lista1[j+1];
                    lista1[j+1]=aux;
                }
            }
        }
        
        for(int notas:lista1){
            System.out.println(notas);
        }
        
    }
    
}
