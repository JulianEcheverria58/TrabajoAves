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
public class Canario extends Ave implements Volar{
    
    public void makeSound(){
        System.out.println("Canta");
    }
    
            public void vuela(){
        System.out.println("vuela con alas");
    }
}
