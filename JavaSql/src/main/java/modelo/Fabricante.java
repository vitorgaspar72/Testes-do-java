/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;


public class Fabricante {
    
    private int idFabricante;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Produto>produtos;

    public Fabricante(){
        produtos= new ArrayList<>();
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void excluirProduto(Produto produto){
        produtos.remove(produto);
    }
    
    public int quantidadeProduto(){
        return produtos.size();
    }
    
    public Produto mostraProduto(int posicao){
        return produtos.get(posicao);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public String toString() {
        return "\n\nID do Fabricante: " + this.getIdFabricante() + "\nNome do Fabricante: " + this.getNome()  
                
                +"\nQuantidade de Produtos: "+this.quantidadeProduto();
    }
    
    
}
