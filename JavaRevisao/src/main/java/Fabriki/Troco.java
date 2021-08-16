/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabriki;


import java.util.Scanner;

/**
 *
 * @author Elisete
 */
public class Troco {

    /**
     * Novo teste de troco 2
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float n1 = tec.nextFloat();
        
        int n2,n3,n4,n5,n6,n7,n8;
        double n9,n10;
  
        n2=(int) (n1/100);
        if(n2>=1){
            System.out.println("O troco será de "+ n2+ " notas de R$100");
            
           
        }
        n3 = (int) ((n1-(n2*100))/50);
        if(n3==1){
            System.out.println("1 nota de R$50");
           
        }
        
        n4 = (int) ((n1-(n2*100)-(n3*50))/20);
        if(n4>=1){
            System.out.println(n4+" notas de R$20");
            
        }
        
        n5 = (int)( (n1-(n2*100)-(n3*50)-(n4*20))/10);
        
        if(n5==1){
            System.out.println("1 nota de R$10");
            
        }
        
        n6 = (int) (n1-(n2*100)-(n3*50)-(n4*20)-(n5*10))/5;
        if(n6==1){
            System.out.println("1 nota de R$5");
        }
        
        n7 = (int)(n1-(n2*100)-(n3*50)-(n4*20)-(n5*10)-(n6*5))/2;
        if(n7>=1){
            System.out.println(n7+" nota de R$2");
            
        }
        
        n8 = (int) (n1-(n2*100)-(n3*50)-(n4*20)-(n5*10)-(n6*5)-(n7*2));
        if(n8==1){
            System.out.println("1 moeda de R$1");
        }
        
        
        
       
    }
    
}