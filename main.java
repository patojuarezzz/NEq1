package uvm; 

  

public class Main { 

    public static void main(String[] args) { 

        // Inicializamos a los dos hermanos con 100% de stamina inicial 

        Ladron[] hermanos = { 

            new Ladron("Hermano Mayor", "Demoledor / Cerrajero", 100, 0), 

            new Ladron("Hermano Menor", "Negociador / Control Emocional", 100, 0) 

        }; 

        System.out.println("=== ATRACO AL BANCO FEDERAL (BÓVEDA CERO) - Integrantes atrapados: " + hermanos.length + " ==="); 

        for (Ladron h : hermanos) { 

            System.out.println("--- Operativo: " + h.getNombre() + " (" + h.getRol() + ") ---"); 

            System.out.println("Estado inicial: " + h.getState()); 

            h.start(); 

            System.out.println("Estado tras start(): " + h.getState());   

            h.interrupt(); 

            try { 

                h.join(); 

            } catch (InterruptedException e) { 

                System.out.println("Interrupción durante el join."); 

            } 

            System.out.println("Estado final: " + h.getState()); 

        } 

        System.out.println("=== Fin del hilo principal Main ==="); 

    } 

} 
