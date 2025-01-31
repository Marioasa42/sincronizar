/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApagaBombilla;

public class Bombilla {
    static private boolean interruptorGeneral = true;
    private boolean bombilla;    
    Bombilla(boolean bombilla){
        this.bombilla = bombilla;
    }
    void apagarBombilla(){
        bombilla = false;
    }
    void encenderBombilla(){
         bombilla = true;
    }
    static void estadoGeneral(){
        if(interruptorGeneral) System.out.println("El general esta encendido");
        else System.out.println("El general esta apagado");
    }
    boolean estadoBombilla(){
        boolean apagado = false;
        if(!interruptorGeneral || !bombilla) apagado = true;
        return apagado;    
     }
    static void apagarGeneral(){
         interruptorGeneral = false;
    }
    static void encenderGeneral(){
         interruptorGeneral = true;
    }
    void mostrarEstado(){
        if(estadoBombilla()) System.out.println("La bombilla esta apagada.");
        else System.out.println("La bombilla esta encendida.");
    }
}
