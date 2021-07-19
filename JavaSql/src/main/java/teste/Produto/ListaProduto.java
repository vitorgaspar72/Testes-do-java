
package teste.Produto;

import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Produto;


public class ListaProduto {

    
    public static void main(String[] args) {
        ProdutoDAO prod = new ProdutoDAO();
        
        
        try{
        ArrayList<Produto> produtos = prod.listaProduto();
            for(int i=0;i<produtos.size();i++){
                System.out.println(produtos.get(i));
            }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!"+e.getMessage());
        }
        
    }
    
}
