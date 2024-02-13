/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoaves;

/**
 *
 * @author julian.echeverria
 */
public abstract class Ave {
   
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;
    
    //metodos de una ave
    
     public abstract void makeSound();

    
    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
     
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
    
}
