/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApagaBombilla;
public class main {
    public static void main(String[] args) {
        Bombilla b1, b2, b3, b4;
        b1 = new Bombilla(true);
        b2 = new Bombilla(false);
        b3 = new Bombilla(true);
        b4 = new Bombilla(false);
        Bombilla.estadoGeneral();
        b1.mostrarEstado();
        b2.mostrarEstado();
        b3.mostrarEstado();
        b4.mostrarEstado();
        Bombilla.apagarGeneral();
        b1.mostrarEstado();
        b2.mostrarEstado();
        b3.mostrarEstado();
        b4.mostrarEstado();
        Bombilla.encenderGeneral();
        b1.apagarBombilla();
        b2.encenderBombilla();
        b1.mostrarEstado();
        b2.mostrarEstado();
        b3.mostrarEstado();
        b4.mostrarEstado();

        
        
    }
    
}
