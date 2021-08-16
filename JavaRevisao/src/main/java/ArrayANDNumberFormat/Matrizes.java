
package ArrayANDNumberFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;


public class Matrizes {

    public static void main(String[] args) {
        // Programa para mostrar as notas de 3 alunos nos 4 bimestres

        double [][] alunos= new double[3][4];
        int b=0;
        int a=0;
        Scanner teclado = new Scanner(System.in);
        
         String padrao= "###,###.##";  //Padrão americano
        
        Locale en = new Locale("en","United States");
        DecimalFormatSymbols dfs= new DecimalFormatSymbols(en);
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat(padrao,dfs);
    
        
        String padrao2="###.###,##";
        Locale pt = new Locale("pt","Brazil");
        DecimalFormatSymbols dfs2= new DecimalFormatSymbols(pt);
        dfs2.setDecimalSeparator(',');
        dfs2.setGroupingSeparator('.');
        DecimalFormat df2 = new DecimalFormat(padrao,dfs2);
        
 
        for(int i=0;i<12;i++){
            
            System.out.println("Digite a nota "+(b+1)+ " do aluno "+(a+1)+"\n");
            alunos[a][b]=teclado.nextFloat();
            b++;
            
            if(b==4){
                b=0;
                a++;
            }
            
        }
        
        a=0;
        b=0;
        for(int i=0;i<12;i++){
            System.out.println("-------------------");
            System.out.println("\n As notas do aluno "+(a+1)+" são : \n");
            while(b<4){
                System.out.println("\n"+df2.format(alunos[a][b]));
                b++;
            }
            
            if(b==4){
                a++;
                if(a==3){
                    System.exit(0);
                }
                b=0;
            }
        }
        
        
    }
    
}
