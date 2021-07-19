
package teste.Produto;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Produto;


public class ExcluiProduto {

    
    public static void main(String[] args) {
        ProdutoDAO prod = new ProdutoDAO();
        Produto prod1= new Produto();
        Produto prod2= new Produto();
        
        try{
            prod1.setNomeProduto("Alpino");
            prod2.setNomeProduto("Bis");
            prod.excluiProduto(prod1);
            prod.excluiProduto(prod2);
            JOptionPane.showMessageDialog(null, "Produto(s) excluídos com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro de conexão com o banco de dados!");
        }
        
        
        
    }
    
}
