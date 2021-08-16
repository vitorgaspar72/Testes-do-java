
package DecimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TesteDecimalFormat {

    public static void main(String[] args) {
        
        
        String padrao= "###,###.##";  //Padrão americano
        
        Locale en = new Locale("en","United States");
        DecimalFormatSymbols dfs= new DecimalFormatSymbols(en);
        dfs.setDecimalSeparator('.');
        dfs.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat(padrao,dfs);
        
        
        System.out.println(df.format(129083.23));
        
        
        String padrao2="###.###,##";
        Locale pt = new Locale("pt","Brazil");
        DecimalFormatSymbols dfs2= new DecimalFormatSymbols(pt);
        dfs2.setDecimalSeparator(',');
        dfs2.setGroupingSeparator('.');
        DecimalFormat df2 = new DecimalFormat(padrao,dfs2);
        
        
        System.out.println("\n"+df2.format(209832.23));
        
        
        
        
       
    }
    
}


