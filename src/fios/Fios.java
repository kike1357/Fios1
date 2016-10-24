package fios;

/**
 *
 * @author epastorizalorenzo
 */
public class Fios extends Thread{
int nDatos;
    
    public static void main(String[] args) {
        new Fios("Juan").start();
        new Fios("Manolo").start();
        
        
    }
    public Fios (String str) {
            super(str);
        }
    public void run(){
        for (int i=0; i<10; i++)
            System.out.println(i + " " + getName());
            System.out.println(" Termina thread " + getName());
            for (int i=0; i<nDatos; i++){
                
    try {   
        System.out.println("Esperando a recibir dato");
        Thread.sleep(500);

    } catch
        (InterruptedException e){
        System.out.println ("Fío interrumpido");
        return;
}
    // Gestiona dato i
}
        System.out.println ("Fío finalizando correctamente");

            }   
    }
    
    

