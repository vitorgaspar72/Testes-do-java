
package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFactory {
    
    
        /*Informa-se tres parametros para a conexão de banco de dados*/
    private static final String URL="jdbc:mysql://localhost/drogaria"; 
    private static final String USUARIO="root";
    private static final String PASS=null;
    
    public static Connection conectar() throws SQLException{ //Não precisa instanciar pra invocar o metodo
      
      
            Connection conexao = DriverManager.getConnection(URL,USUARIO,PASS);
            return conexao;
           
            
       
        
        

        
    }
    
}
