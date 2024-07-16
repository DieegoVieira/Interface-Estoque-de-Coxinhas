package com.mycompany;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class InterfaceMaquinaCoxinha {
    @FXML
    private TextField numeroAbastecimento;
    @FXML
    private TextField venderCoxinhas;
    @FXML
    private TextField quantidadeEstoque;

    private MaquinaDeCoxinha maquina;
    
    @FXML
    private void initialize(){
        maquina = new MaquinaDeCoxinha();
        
    }
    
    
    @FXML
    public void atualizaEstoque(){
        quantidadeEstoque.setText(String.valueOf(maquina.getEstoque()));
    }
    
    @FXML
    public void abastecer(){
        maquina.abastecer(Integer.parseInt(numeroAbastecimento.getText()));
        atualizaEstoque();
        numeroAbastecimento.setText("");
    }
    
    @FXML
    public void venderUm(){
        maquina.venderCoxinha();
        atualizaEstoque();
    }
    
    @FXML
    public void venderMais(){
        maquina.venderCoxinha(Integer.parseInt(venderCoxinhas.getText()));
        atualizaEstoque();
        venderCoxinhas.setText("");
    }
    
    @FXML
    public void zerarEstoque(){
        maquina.zerar();
        atualizaEstoque();
    }
}
