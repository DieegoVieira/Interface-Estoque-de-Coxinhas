package com.mycompany;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MaquinaDeCoxinha {
    // DECLARACAO DE VARIÁVEIS
    private int estoque;
    
    
    
    // CONSTRUTORES E MÉTODOS
    public MaquinaDeCoxinha(){
        estoque=0;
    }
    
    public void abastecer(int numCoxinhas){
        if(numCoxinhas > 0){
            setEstoque(numCoxinhas + getEstoque());
        }
        else{
             Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Abasteça mais de 0 ovos");
            alert.show();
            return; 
        }
    }
    
    public void venderCoxinha(){
        if(getEstoque() > 0){
            setEstoque(getEstoque()-1);
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Quantidade de coxinhas insuficiente");
            alert.show();
            return; 
        }
    }
    public void venderCoxinha(int numCoxinhas){
        if(getEstoque() - numCoxinhas >= 0){
            setEstoque(getEstoque() - numCoxinhas);
        }
        else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Quantidade de coxinhas insufuciente");
            alert.show();
            return; 
        }
    }
    
    public void zerar(){
        setEstoque(0);
    }
        
    
    //GETs E SETs
    public int getEstoque(){
        return estoque;
    }
    public void setEstoque(int novo){
        estoque = novo;
    }
}   
