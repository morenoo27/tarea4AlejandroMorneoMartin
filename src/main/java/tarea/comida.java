package tarea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class comida {

    private int Menu;
    private int Bebida;
    private int mesa;

    public comida() {
    }

    public comida(int Menu, int Bebida, int mesa) {
        this.Menu = Menu;
        this.Bebida = Bebida;
        this.mesa = mesa;
    }

    public int getMenu() {
        return Menu;
    }

    public int getBebida() {
        return Bebida;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMenu(int Menu) {
        this.Menu = Menu;
    }

    public void setBebida(int Bebida) {
        this.Bebida = Bebida;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    
    
}
