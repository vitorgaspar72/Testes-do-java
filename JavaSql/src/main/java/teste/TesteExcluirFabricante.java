
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;


public class TesteExcluirFabricante {

    
    public static void main(String[] args) throws SQLException {
        FabricanteDAO fab= new FabricanteDAO();
        Fabricante f1= new Fabricante();
        Fabricante f2= new Fabricante();
        Fabricante f3= new Fabricante();
        f1.setIdFabricante(1);
        f2.setIdFabricante(2);
        f3.setIdFabricante(3);
        f1.setNome("Nestlé");
        f2.setNome("Lacta");
        f3.setNome("Mars");
        
        
        try{
        fab.excluir(f1);
        fab.excluir(f3);
        fab.excluir(f2);
        
        JOptionPane.showMessageDialog(null, "Fabricante "+f1.getNome()+" foi excluído com sucesso.");
        JOptionPane.showMessageDialog(null, "Fabricante "+f2.getNome()+" foi excluído com sucesso.");
        JOptionPane.showMessageDialog(null, "Fabricante "+f3.getNome()+" foi excluído com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir fabricante");
        }
    }
    
}
