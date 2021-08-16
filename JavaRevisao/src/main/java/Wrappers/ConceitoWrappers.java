/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers;

/**
 *
 * @author Elisete
 */
public class ConceitoWrappers {

    // São as classes que representam os tipos primitidos do Java
    public static void main(String[] args) {
       short num1 = 1;
       byte num2 = 120;
       int num3 = 40000;
       long num4 = 3000000;
       float num5 = 3.0921309213f;
       double num6 = 912.98;
       char carac= 'F';
       boolean filos = true;
       
       //autoboxing, de primitivo para objeto
       Short num10 = new Short((short)num1); // Classe wrapper de short, sem autoboxing
       Byte num11 = num2; // com autoboxing
       Integer num12 = num3;
       Long num13 = num4;
       Float num14 = num5;
       Double num15= num6;
       Character caracs = carac;
       Boolean bool = filos;
       
       
       //autounboxing, transforma um numero com base em um objeto, de objeto para primitivo
       int num20 = num12;
       System.out.println(num10.equals(bool));
       
       //autoboxing para objeto
       num11++;
       
       
    }
    
}
