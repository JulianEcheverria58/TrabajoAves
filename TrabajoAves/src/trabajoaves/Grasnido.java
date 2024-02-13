/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoaves;

import java.util.logging.Logger;
import org.slf4j.Logger;

/**
 *
 * @author julian.echeverria
 */
public class Grasnido implements TipoSonido {
    
    public static final Logger  logger = LoggerFactoy.getLogger(Grasnido.class);
    
    public void makeSound(){
        logger.debug("grasnando");
        System.out.println("grasnando");
    }
    
    
    
    
    
}

