
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;


public class TesteSalvarFabricante {

    
    public static void main(String[] args) {
        Fabricante fab1= new Fabricante();
        
        
        FabricanteDAO fdao= new FabricanteDAO();
       try{ 
        fab1.setNome("L'or Brasil");
    
        
        
        fdao.salvar(fab1);
        
        JOptionPane.showMessageDialog(null, "Fabricante Cadastrado");
       }catch(SQLException sql){
           JOptionPane.showMessageDialog(null, "Erro de envio "+sql.getMessage());
       } 
    }
    
}
