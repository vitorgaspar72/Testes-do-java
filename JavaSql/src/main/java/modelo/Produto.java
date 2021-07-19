/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.util.Locale;



/**
 *
 * @author user
 */
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private int quantidade;
    private double valor;
    private Fabricante fabricante;
    
    Locale pt = new Locale("pt","Brazil");
    DecimalFormatSymbols dfs = new DecimalFormatSymbols(pt);
    
    
    public Produto(){
        
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        dfs.setDecimalSeparator(',');
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao,dfs);
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return "\nID do Produto: " + this.getIdProduto() + "\nNome do Produto: " + this.getNomeProduto() + 
                "\nQuantidade: " + this.getQuantidade() + "\nValor = R$" + df.format(this.getValor())+ "\nID do fabricante: " + this.getFabricante().getIdFabricante()
                + "\nNome do Fabricante: "+this.getFabricante().getNome();
    }
    
    
}
