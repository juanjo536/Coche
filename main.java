
package ruedassas.Caracteristicas;

import ruedassas.RuedasSAS;


public class main {
        public static void main(String[] args){
        
        RuedasSAS auto = new RuedasSAS("Ford", 2019, 3.5,
                RuedasSAS.TipodeCombustible.Bioetanol,
                RuedasSAS.TipodeAutomovil.Ciudad,
                RuedasSAS.Color.Violeta, 4, 5, 250, 100);
        
                
                
        auto.darInformacion();
        
        
        auto.setVelActual(100);
        System.out.println("Velocidad actual despues de iniciar:"
        + auto.getVelActual()+ "km/h");
        
        
        auto.acelerar(20);
        
        auto.desAcelerar(50);
        
        auto.frenar();
    }
    
}

    

