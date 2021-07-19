
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;


public class TesteEditarFabricante {

    public static void main(String[] args) throws SQLException {
        FabricanteDAO fab= new FabricanteDAO();
        Fabricante f1= new Fabricante();
        
        String fabri = JOptionPane.showInputDialog(null, "Digite o novo nome do fabricante");
        
        f1.setNome(fabri);
        f1.setIdFabricante(6);
        
        try{
            fab.editar(f1);
            JOptionPane.showMessageDialog(null, "Fabricante editado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao editar fabricante!");
        }
    }
    
}
