package uvm; 

  

public class Ladron extends Thread { 

    private String nombre; 

    private String rol; 

    private int stamina; 

    private int estres; 

  

    public Ladron(String nombre, String rol, int stamina, int estres) { 

        this.nombre = nombre; 

        this.rol = rol; 

        this.stamina = stamina; 

        this.estres = estres; 

    } 

    public String getNombre() { return nombre; } 

    public void setNombre(String nombre) { this.nombre = nombre; } 

  

    public String getRol() { return rol; } 

    public void setRol(String rol) { this.rol = rol; } 

    public int getStamina() { return stamina; } 

    public void setStamina(int stamina) { this.stamina = stamina; } 

    public int getEstres() { return estres; } 

    public void setEstres(int estres) { this.estres = estres; } 

    @Override 

    public void run() { 

        for (int i = 1; i <= 5; i++) { 

            System.out.println(getNombre() + " (" + rol + ") trabajando... paso " + i + " - Estado: " + getState()); 

            try { 

                Thread.sleep(500); 

            } catch (InterruptedException e) { 

                System.out.println("¡Interrupción por colapso o agotamiento en " + nombre + "!"); 

                break; 

            } 

        } 

    } 

} 

BovedaRecursos.ja
