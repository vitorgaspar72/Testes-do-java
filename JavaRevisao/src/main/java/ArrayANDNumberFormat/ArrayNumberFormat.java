
package ArrayANDNumberFormat;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JOptionPane;


public class ArrayNumberFormat {

  
    public static void main(String[] args) {
        double [] dias= new double[60];
        double porcentagem=1.001;
        double saldo;
        
        //1.000,00 - Brasil
        //1,000.00 - EUA
        
        
        // Quando nao se precisa de muita precisao nas casas decimais se usa o number format
        Locale pt= new Locale("pt","Brazil");
        Locale en = new Locale("en","United States");
        
        NumberFormat nf = NumberFormat.getInstance(pt); // Formatacao simples
        
        //Moeda
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(pt); // Formatação para moeda
        NumberFormat nf3= NumberFormat.getCurrencyInstance(en);
        
        NumberFormat nf4= NumberFormat.getInstance(Locale.getDefault()); // Pega a configuração de idioma e local do sistema operacional configurado
        nf4.setMaximumFractionDigits(2);
        nf4.setMinimumFractionDigits(2);
       
        
        
        Currency real = nf2.getCurrency();

        
        //Porcentagem  (converte para String)
        
        NumberFormat nf5= NumberFormat.getPercentInstance();
        nf5.setMaximumFractionDigits(4); //Mostra o numero maximo de casas decimais
        nf5.setMinimumFractionDigits(2);//Número minimo de casas decimais
        String porc= nf5.format(porcentagem);
        System.out.println(porc);
        
        
        
        //Arrendondamento
        
        
        double teste= 1.988888;
        nf.setRoundingMode(RoundingMode.CEILING);
        System.out.println(nf.format(teste));
        
        
        String saldo1=   JOptionPane.showInputDialog(null, "Defina o valor de depósito para ganho diário de 3% ao mes");
         saldo= Double.valueOf(saldo1);
        
        
        
        for(int i=0;i<30;i++){
            saldo= saldo*porcentagem;
            
            dias[i]=saldo;
        }
        
        for(int i=1;i<=30;i++){
            System.out.println("O saldo do dia "+i+" foi de R$"+ nf4.format(dias[i-1])+"\n");
        }
         
    }
    
}
